package jp.ac.sojou.cis.izumi.tron.controller.user;

import jp.ac.sojou.cis.izumi.tron.controller.user.MainController;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MainControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/user/main");
        MainController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/user/main.jsp"));
    }
}
