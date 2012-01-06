package jp.ac.sojou.cis.izumi.tron.controller.user;

import java.util.List;

import jp.ac.sojou.cis.izumi.tron.model.BossBot;
import jp.ac.sojou.cis.izumi.tron.service.BossBotService;

import org.slim3.controller.Navigation;

public class BossChallengeFormController extends UserBaseController {

    private BossBotService bbs = new BossBotService();

    @Override
    public Navigation run2() throws Exception {

        List<BossBot> list = bbs.getList();
        System.out.println(list);
        requestScope("user", user);
        requestScope("bosses", list);

        return forward("bossChallengeForm.jsp");
    }
}
