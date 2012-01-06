package jp.ac.sojou.cis.izumi.tron.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TronMapTest extends AppEngineTestCase {

    private TronMap model = new TronMap();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
