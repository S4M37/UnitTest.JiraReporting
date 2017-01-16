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
    public void testAdd() throws Exception {
        assertEquals(new Long(4), op.add(new Long(1), new Long(3)));
    }

    @Test
    public void testMultiplication() throws Exception {
        assertEquals(new Long(6), op.multiplication(new Long(2), new Long(3)));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(new Long((long) 1.5), op.divide(new Long(3), new Long(2)));
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(new Long(-2), op.subtract(new Long(1), new Long(3)));
    }


}
