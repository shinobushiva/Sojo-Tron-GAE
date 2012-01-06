package jp.ac.sojou.cis.izumi.tron.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UserAccountServiceTest extends AppEngineTestCase {

    private UserAccountService service = new UserAccountService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
