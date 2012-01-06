package jp.ac.sojou.cis.izumi.tron.controller;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.ac.sojou.cis.izumi.tron.dao.ChallengeResultDao;
import jp.ac.sojou.cis.izumi.tron.dao.UserBotDao;
import jp.ac.sojou.cis.izumi.tron.model.BossBot;
import jp.ac.sojou.cis.izumi.tron.model.ChallengeResult;
import jp.ac.sojou.cis.izumi.tron.model.TronMap;
import jp.ac.sojou.cis.izumi.tron.model.UserBot;
import jp.ac.sojou.cis.izumi.tron.service.BossBotService;
import jp.ac.sojou.cis.izumi.tron.service.CompileService;
import jp.ac.sojou.cis.izumi.tron.service.TronMapService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import tron.utils.Point;
import tron.utils.Tron;
import tron.utils.TronBot;

import com.google.appengine.api.datastore.Key;

public class BattleTaskController extends Controller {

    private BossBotService bbs = new BossBotService();
    private TronMapService tms = new TronMapService();
    private UserBotDao ubDao = new UserBotDao();
    private ChallengeResultDao crDao;

    @Override
    public Navigation run() throws Exception {

        System.out.println("Key = " + asString("uBotKey"));
        Key uKey = asKey("uBotKey");
        UserBot uBot = ubDao.get(uKey);
        String bossName = asString("bossName");
        String mapName = asString("map");

        System.out.println(mapName);
        BossBot bossBot = bbs.get(bossName);
        System.out.println(bossName);

        TronMap map = tms.getMap(mapName);
        if (map == null) {
            List<String> maps = tms.getMapNameList();
            Collections.shuffle(maps);
            map = tms.getMap(maps.get(0));
        }

        fight(uBot, bossBot, map);

        return null;
    }

    private void fight(UserBot uBot, BossBot bossBot, TronMap map)
            throws MalformedURLException, IOException,
            UnsupportedEncodingException {

        Map<String, byte[]> hm = new HashMap<String, byte[]>();
        hm.put(uBot.getClassName(), uBot.getClassBytes());
        hm.put(bossBot.getClassName(), bossBot.getClassBytes());

        CompileService.TronClassLoader cl =
            new CompileService.TronClassLoader(hm, Thread
                .currentThread()
                .getContextClassLoader());

        TronBotWrapper tbw1 =
            new TronBotWrapper(cl.findClass(uBot.getClassName()));
        TronBotWrapper tbw2 =
            new TronBotWrapper(cl.findClass(bossBot.getClassName()));

        Tron t = new Tron();
        String[] vals =
            t.tron(
                new tron.utils.TronMap(new StringReader(map.getMap())),
                tbw1,
                tbw2,
                0,
                1000);

        saveResult(uBot, bossBot, vals);

    }

    private void saveResult(UserBot uBot, BossBot bossBot, String[] vals) {
        String win = vals[0];
        String result = vals[1];

        ChallengeResult cr = new ChallengeResult();
        cr.setBossChallenge(true);
        cr.setBossBot(bossBot);
        cr.setUser1(uBot.getUserRef().getModel());
        cr.getUser1Ref().setModel(uBot.getUserRef().getModel());
        cr.setUser1Bot(uBot);
        cr.setWinner(win);
        cr.setResult(result);
        cr.setTime(new Date());

        crDao = new ChallengeResultDao();
        Key put = crDao.put(cr);
        System.out.println(Datastore.keyToString(put));
        requestScope("key", Datastore.keyToString(put));
    }

    class TronBotWrapper implements TronBot {

        private Object instance;
        private Class<?> mapClass;
        private Method makeMove;

        public TronBotWrapper(Class<?> bc) {
            try {
                mapClass = tron.utils.Map.class;
                instance = bc.newInstance();
                makeMove =
                    bc.getMethod("makeMove", new Class<?>[] { mapClass });

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        @SuppressWarnings("deprecation")
        private void copyMap(tron.utils.Map s, tron.utils.Map d) {
            boolean[][] walls = s.getWalls();
            int width = s.getWidth();
            int height = s.getHeight();
            Point myLocation = s.getMyLocation();
            Point opponentLocation = s.getOpponentLocation();

            boolean[][] ws = new boolean[walls.length][];
            for (int i = 0; i < width; i++) {
                ws[i] = new boolean[walls[i].length];
                for (int j = 0; j < height; j++) {
                    ws[i][j] = walls[i][j];
                }
            }
            Point ml = new Point(myLocation.getX(), myLocation.getY());
            Point ol =
                new Point(opponentLocation.getX(), opponentLocation.getY());
            d.setWalls(ws);
            d.setWidth(width);
            d.setHeight(height);
            d.setMyLocation(ml);
            d.setOpponentLocation(ol);

        }

        public String makeMove(tron.utils.Map m) {

            Object mapInst;
            try {
                mapInst = mapClass.newInstance();
                copyMap(m, (tron.utils.Map) mapInst);

                return (String) makeMove.invoke(instance, mapInst);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
