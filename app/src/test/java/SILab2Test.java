import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void testEveryBranch() {
        // 1
        try {
            SILab2.checkCart(null, 100);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("allItems list can't be null!", e.getMessage());
        }
		



    }
 @Test
    public void testMultipleCondition() {
        // 1
        List<Item> items1 = List.of(new Item("Item1", "0123", 400, 0.1f));
        assertTrue(SILab2.checkCart(items1, 350)); 

    }
	
}
