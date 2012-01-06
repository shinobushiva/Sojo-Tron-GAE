package jp.ac.sojou.cis.izumi.tron.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import jp.ac.sojou.cis.izumi.tron.meta.BossBotMeta;
import jp.ac.sojou.cis.izumi.tron.model.BossBot;

public class BossBotService {

    public List<BossBot> getList() {
        return Datastore.query(BossBot.class).asList();
    }

    public BossBot get(String name) {
        return Datastore
            .query(BossBot.class)
            .filter(BossBotMeta.get().name.equal(name))
            .asSingle();
    }
}
