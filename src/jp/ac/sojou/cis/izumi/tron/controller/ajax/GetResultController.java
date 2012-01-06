package jp.ac.sojou.cis.izumi.tron.controller.ajax;

import java.util.HashMap;
import java.util.Map;

import com.google.appengine.api.datastore.Key;

import jp.ac.sojou.cis.izumi.tron.dao.ChallengeResultDao;
import jp.ac.sojou.cis.izumi.tron.model.ChallengeResult;
import jp.co.topgate.controller.JsonController;

public class GetResultController extends JsonController {

    private ChallengeResultDao crDao;

    @Override
    protected Map<String, Object> handle() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();

        Key asKey = asKey("key");
        crDao = new ChallengeResultDao();
        ChallengeResult cr = crDao.get(asKey);

        map.put("winner", cr.getWinner());
        map.put("result", cr.getResult());

        return map;
    }
}
