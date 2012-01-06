package jp.ac.sojou.cis.izumi.tron.controller.ajax;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GetResultControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/ajax/getResult");
        GetResultController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
