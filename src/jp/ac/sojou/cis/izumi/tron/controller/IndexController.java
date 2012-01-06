package jp.ac.sojou.cis.izumi.tron.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("loginForm");
    }
}
