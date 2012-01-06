package jp.ac.sojou.cis.izumi.tron.controller.user;

import jp.ac.sojou.cis.izumi.tron.model.UserBot;

import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

public class BossChallenge2Controller extends UserBaseController {

    @Override
    public Navigation run2() throws Exception {

        UserBot uBot = userAccountService.getCurrentUserBot(user);
        String bossName = asString("bossName");
        String mapName = asString("map");

        TaskOptions task =
            TaskOptions.Builder
                .withUrl("/battleTask")
                .param("uBotKey", KeyFactory.keyToString(uBot.getKey()))
                .param("bossName", bossName)
                .param("map", mapName)
                .method(TaskOptions.Method.POST);

        QueueFactory.getQueue("battle").add(task);
        System.out.println("Queue Add");

        return forward("/user/resultList");
    }

}
