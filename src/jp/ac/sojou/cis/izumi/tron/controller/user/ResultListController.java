package jp.ac.sojou.cis.izumi.tron.controller.user;

import java.util.List;

import jp.ac.sojou.cis.izumi.tron.controller.user.UserBaseController;
import jp.ac.sojou.cis.izumi.tron.dao.ChallengeResultDao;
import jp.ac.sojou.cis.izumi.tron.model.ChallengeResult;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ResultListController extends UserBaseController {
    private ChallengeResultDao crDao = new ChallengeResultDao();

    @Override
    public Navigation run2() throws Exception {

        List<ChallengeResult> rl = crDao.getResults(user, 10);
        requestScope("results", rl);

        return forward("resultList.jsp");
    }
}
