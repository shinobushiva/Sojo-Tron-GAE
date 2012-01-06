package jp.ac.sojou.cis.izumi.tron.dao;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UserBotDaoTest extends AppEngineTestCase {

    private UserBotDao dao = new UserBotDao();

    @Test
    public void test() throws Exception {
        assertThat(dao, is(notNullValue()));
    }
}
