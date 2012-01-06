package jp.ac.sojou.cis.izumi.tron.controller.user;

import java.util.ArrayList;
import java.util.List;

import jp.ac.sojou.cis.izumi.tron.model.UserBot;

import org.slim3.controller.Navigation;

public class MainController extends UserBaseController {

    @Override
    public Navigation run2() throws Exception {

        requestScope("user", user);
        List<UserBot> userBots = userAccountService.getUserBots(user);
        if (userBots.size() > 0) {
            List<UserBot> c = new ArrayList<UserBot>(userBots);
            c.remove(0);
            userBots.removeAll(c);
        }
        requestScope("bots", userBots);

        return forward("main.jsp");
    }
}
