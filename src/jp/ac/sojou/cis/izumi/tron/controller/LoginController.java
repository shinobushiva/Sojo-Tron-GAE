package jp.ac.sojou.cis.izumi.tron.controller;

import jp.ac.sojou.cis.izumi.tron.model.UserAccount;
import jp.ac.sojou.cis.izumi.tron.service.UserAccountService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class LoginController extends Controller {
    private UserAccountService userAccountService = new UserAccountService();

    @Override
    public Navigation run() throws Exception {

        String userId = asString("userId");
        String password = asString("password");

        System.out.println("Login : " + userId + "," + password);

        UserAccount ua = userAccountService.get(userId);
        if (ua == null) {
            errors.put("test", "ログインIDかパスワードが違います");
            return forward("/loginForm.jsp");
        }

        if (!ua.getPassword().equals(password)) {
            errors.put("test", "ログインIDかパスワードが違います");
            return forward("/loginForm.jsp");
        }

        sessionScope("userId", userId);

        return forward("user/main");
    }
}
