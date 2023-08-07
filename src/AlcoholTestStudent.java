import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTestStudent {
    Alcohol FirstOrder, secondOrder;
    @Before
    public void setUp() throws Exception {
        FirstOrder = new Alcohol("Bartenura", Size.SMALL, false);
        secondOrder = new Alcohol("Bartenura", Size.MEDIUM, true);
    }

    @After
    public void tearDown() throws Exception {
        FirstOrder = secondOrder =  null;
    }

    @Test
    public void getIsWeekend() {
        Alcohol Al = new Alcohol("Bartenura", Size.SMALL, false);
        Al.setIsWeekend(false);
        assertEquals(false, Al.getIsWeekend());
        Al.setIsWeekend(true);
        assertEquals(true, Al.getIsWeekend());
    }

    @Test
    public void calcPrice() {
        assertEquals(2.0, FirstOrder.calcPrice(), .01);
        assertEquals(3.6, secondOrder.calcPrice(), .01);
    }
}
