package jp.ac.sojou.cis.izumi.tron.dao;

import java.util.List;

import jp.ac.sojou.cis.izumi.tron.meta.ChallengeResultMeta;
import jp.ac.sojou.cis.izumi.tron.model.ChallengeResult;
import jp.ac.sojou.cis.izumi.tron.model.UserAccount;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;

public class ChallengeResultDao extends DaoBase<ChallengeResult> {

    public List<ChallengeResult> getResults(UserAccount ua, int limit) {
        ChallengeResultMeta cm = ChallengeResultMeta.get();
        List<ChallengeResult> list =
            Datastore
                .query(ChallengeResult.class)
                .filter(cm.user1Ref.equal(ua.getKey()))
                .sort(cm.time.desc)
                .limit(limit)
                .asList();

        return list;
    }
}
