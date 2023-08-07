import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent {
    Coffee firstOrder, secondOrder, thirdOrder;
    @Before
    public void setUp() throws Exception {
        firstOrder = new Coffee("Latte", Size.SMALL, false, false);
        secondOrder = new Coffee("Latte", Size.MEDIUM, false, true);
        thirdOrder = new Coffee("Latte", Size.MEDIUM, false, false);

    }

    @After
    public void tearDown() throws Exception {
        firstOrder = secondOrder = thirdOrder =  null;
    }

    @Test
    public void getExtraShot() {
        Coffee or = new Coffee("Latte", Size.SMALL, false, false);
        or.setTheExtraShot(true);
        assertEquals(true, or.getTheExtraShot());
    }

    @Test
    public void getExtraSyrup() {
        Coffee or = new Coffee("", Size.SMALL, false, false);
        or.setTheExtraSyrup(true);
        assertEquals(true, or.getTheExtraSyrup());
    }

    @Test
    public void calcPrice() {
        assertEquals(2.0, firstOrder.calcPrice(), .01);
        assertEquals(3.5, secondOrder.calcPrice(), .01);
        assertEquals(3.0, thirdOrder.calcPrice(), .01);
    }
}
