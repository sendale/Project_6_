import org.junit.Test;
import static org.junit.Assert.*;

public class SizeTestStudent {
    @Test
    public void EnumTest(){
        Size alcohol  = Size.SMALL;
        assertEquals(Size.valueOf("SMALL"), alcohol);
    }
}
