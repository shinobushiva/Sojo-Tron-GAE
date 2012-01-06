package jp.ac.sojou.cis.izumi.tron.controller.admin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import jp.ac.sojou.cis.izumi.tron.dao.TronMapDao;
import jp.ac.sojou.cis.izumi.tron.model.BossBot;
import jp.ac.sojou.cis.izumi.tron.model.TronMap;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.GlobalTransaction;

import com.google.appengine.api.datastore.Key;

public class InitTronMapController extends Controller {

    TronMapDao dao = new TronMapDao();

    @Override
    public Navigation run() throws Exception {

        List<Key> maps = Datastore.query(TronMap.class).asKeyList();
        dao.delete(maps);

        initMap("apocalyptic");
        initMap("big-room");
        initMap("divider");
        initMap("center");
        initMap("divider");
        initMap("empty-room");
        initMap("huge-room");
        initMap("joust");
        initMap("keyhole");
        initMap("playground");
        initMap("quadrant");
        initMap("ring");
        initMap("toronto");
        initMap("trix");
        initMap("u");

        return null;
    }

    private void initMap(String name) throws FileNotFoundException, IOException {
        BufferedReader r =
            new BufferedReader(new FileReader("maps/" + name + ".txt"));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = r.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }

        TronMap tm = new TronMap();
        tm.setName(name);
        tm.setMap(sb.toString());

        dao.put(tm);
    }
}
