package jp.ac.sojou.cis.izumi.tron.controller.admin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import jp.ac.sojou.cis.izumi.tron.dao.BossBotDao;
import jp.ac.sojou.cis.izumi.tron.model.BossBot;
import jp.ac.sojou.cis.izumi.tron.service.CompileService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

public class InitBossBotController extends Controller {

    private BossBotDao dao = new BossBotDao();
    private CompileService cs = new CompileService();

    @Override
    public Navigation run() throws Exception {

        List<Key> bots = Datastore.query(BossBot.class).asKeyList();
        dao.delete(bots);

        initBot("MyTronBotRandom", 1);
        initBot("MyTronBotStraight", 2);
        initBot("MyTronBotHugger", 3);
        initBot("MinMax", 4);

        return null;
    }

    private void initBot(String name, int level) throws FileNotFoundException,
            IOException {
        BufferedReader r =
            new BufferedReader(new FileReader("bots/" + name + ".java"));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = r.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        String src = sb.toString();
        String fqcn = CompileService.getFQCN(src);
        byte[] ba = cs.compile(fqcn, src);

        BossBot bb = new BossBot();
        bb.setName(name);
        bb.setLevel(level);
        bb.setSourceCode(src);
        bb.setClassBytes(ba);
        bb.setClassName(fqcn);

        dao.put(bb);
    }
}
