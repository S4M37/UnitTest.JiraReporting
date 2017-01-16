import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticTest {
    private Arithmetic op;

    @Before
    public void setUp() {
        op = new Arithmetic();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculer() throws Exception {
        assertEquals(new Long(4), op.add(new Long(1), new Long(3)));
    }

}
