package jp.ac.sojou.cis.izumi.tron.service;

import java.util.ArrayList;
import java.util.List;

import jp.ac.sojou.cis.izumi.tron.meta.TronMapMeta;
import jp.ac.sojou.cis.izumi.tron.model.TronMap;

import org.slim3.datastore.Datastore;

public class TronMapService {

    // private TronMapDao dao = new TronMapDao();

    public List<String> getMapNameList() {
        List<TronMap> maps = Datastore.query(TronMap.class).asList();

        List<String> list = new ArrayList<String>();
        for (TronMap tronMap : maps) {
            list.add(tronMap.getName());
        }
        return list;
    }

    public TronMap getMap(String name) {
        return Datastore
            .query(TronMap.class)
            .filter(TronMapMeta.get().name.equal(name))
            .asSingle();
    }

}
