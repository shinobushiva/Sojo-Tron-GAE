package jp.ac.sojou.cis.izumi.tron.controller;

import java.net.URI;

import jp.ac.sojou.cis.izumi.tron.dao.UserAccountDao;
import jp.ac.sojou.cis.izumi.tron.model.UserAccount;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Errors;
import org.slim3.controller.validator.Validators;
import org.slim3.util.BeanUtil;

public class RegistrationController extends Controller {

    UserAccountDao uaDao = new UserAccountDao();

    @Override
    public Navigation run() throws Exception {

        RegistrationForm form = new RegistrationForm();
        BeanUtil.copy(request, form);

        Validators v = new Validators(request);
        v.add("userId", v.required());
        v
            .add(
                "email",
                v.required(),
                v
                    .regexp("^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$"));
        v.add("password", v.required());
        if (!v.validate()) {
            return forward("/registrationForm.jsp");
        }

        UserAccount ua = new UserAccount();
        ua.setUserId(form.userId);
        ua.setEmail(form.email);
        ua.setPassword(form.password);

        // GlobalTransaction gtx = Datastore.beginGlobalTransaction();
        uaDao.put(ua);
        // gtx.commit();

        return forward("registration.jsp");
    }

    public class RegistrationForm {
        public String userId;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword2() {
            return password2;
        }

        public void setPassword2(String password2) {
            this.password2 = password2;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail2() {
            return email2;
        }

        public void setEmail2(String email2) {
            this.email2 = email2;
        }

        public String password;
        public String password2;
        public String email;
        public String email2;
    }
}
