package jp.ac.sojou.cis.izumi.tron.controller.admin;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class InitBossBotControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/admin/initBossBot");
        InitBossBotController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
