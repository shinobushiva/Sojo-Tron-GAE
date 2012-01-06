package jp.ac.sojou.cis.izumi.tron.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.ac.sojou.cis.izumi.tron.meta.UserAccountMeta;
import jp.ac.sojou.cis.izumi.tron.meta.UserBotMeta;
import jp.ac.sojou.cis.izumi.tron.model.UserAccount;
import jp.ac.sojou.cis.izumi.tron.model.UserBot;

import org.slim3.datastore.Datastore;

public class UserAccountService {

    // private UserAccountDao uaDao;

    public UserAccount get(String userId) {
        try {
            UserAccount asSingle =
                Datastore
                    .query(UserAccount.class)
                    .filter(UserAccountMeta.get().userId.equal(userId))
                    .asSingle();
            return asSingle;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public UserAccount getSessionUser(HttpServletRequest request) {

        String userId = (String) request.getSession().getAttribute("userId");
        return get(userId);
    }

    public List<UserBot> getUserBots(UserAccount ua) {
        if (ua == null) {
            return null;
        }
        return Datastore
            .query(UserBot.class)
            .filter(UserBotMeta.get().userRef.equal(ua.getKey()))
            .sort(UserBotMeta.get().time.desc)
            .asList();
    }

    public UserBot getCurrentUserBot(UserAccount ua) {
        return Datastore
            .query(UserBot.class)
            .filter(UserBotMeta.get().userRef.equal(ua.getKey()))
            .sort(UserBotMeta.get().time.desc)
            .limit(1)
            .asSingle();

    }
}
