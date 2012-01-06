package jp.ac.sojou.cis.izumi.tron.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class RegistrationFormController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("registrationForm.jsp");
    }
}
