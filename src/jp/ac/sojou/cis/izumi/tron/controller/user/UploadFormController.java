package jp.ac.sojou.cis.izumi.tron.controller.user;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class UploadFormController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("uploadForm.jsp");
    }
}
