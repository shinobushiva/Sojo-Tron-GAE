package jp.ac.sojou.cis.izumi.tron.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class LogoutController extends Controller {

    @Override
    public Navigation run() throws Exception {

        request.getSession().invalidate();

        return forward("/loginForm");
    }
}
