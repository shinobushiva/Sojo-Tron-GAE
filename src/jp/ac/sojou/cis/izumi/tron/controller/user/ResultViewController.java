package jp.ac.sojou.cis.izumi.tron.controller.user;

import jp.ac.sojou.cis.izumi.tron.dao.ChallengeResultDao;
import jp.ac.sojou.cis.izumi.tron.model.ChallengeResult;

import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

public class ResultViewController extends UserBaseController {
    private ChallengeResultDao crDao = new ChallengeResultDao();

    @Override
    public Navigation run2() throws Exception {

        Key key = asKey("key");
        ChallengeResult cr = crDao.get(key);

        int winNum = Integer.parseInt(cr.getWinner());
        System.out.println(winNum);
        String winState = "引き分け";
        if (winNum == 1) {
            winState = "勝利";
        } else if (winNum == 2) {
            winState = "敗退";
        }
        requestScope("winNum", winNum);
        requestScope("winner", winState);

        String result = cr.getResult();
        String pr = result.replaceAll("\n", "<br>");
        pr = pr.replaceAll(" ", "　");
        pr = pr.replaceAll("#", "＃");
        pr = pr.replaceAll("1", "１");
        pr = pr.replaceAll("2", "２");

        requestScope("r", cr);
        requestScope("result", result);
        requestScope("printableResult", pr);
        requestScope("key", Datastore.keyToString(key));

        return forward("resultView.jsp");
    }
}
