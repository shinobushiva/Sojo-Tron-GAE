package jp.ac.sojou.cis.izumi.tron.controller.user;

import jp.ac.sojou.cis.izumi.tron.model.UserAccount;
import jp.ac.sojou.cis.izumi.tron.service.UserAccountService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public abstract class UserBaseController extends Controller {

    protected UserAccountService userAccountService = new UserAccountService();

    protected UserAccount user;

    @Override
    public final Navigation run() throws Exception {

        user = userAccountService.getSessionUser(request);

        return run2();
    }

    public abstract Navigation run2() throws Exception;
}
