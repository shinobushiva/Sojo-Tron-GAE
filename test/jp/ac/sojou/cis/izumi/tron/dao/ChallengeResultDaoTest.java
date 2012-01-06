package jp.ac.sojou.cis.izumi.tron.dao;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ChallengeResultDaoTest extends AppEngineTestCase {

    private ChallengeResultDao dao = new ChallengeResultDao();

    @Test
    public void test() throws Exception {
        assertThat(dao, is(notNullValue()));
    }
}
