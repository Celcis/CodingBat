import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RotateTest {
    
    private Rotate rotate;
    
    @Before
    public void init() {
        rotate = new Rotate();
    }
    
    @Test
    public void test001() {
        final String[] values = {"lorem", "ipsum", "dolor", "sit", "amet"};
        final int offset = 3;
        rotate.rotate(values, offset);
        
        assertEquals("dolor", values[0]);
        assertEquals("sit", values[1]);
        assertEquals("amet", values[2]);
        assertEquals("lorem", values[3]);
        assertEquals("ipsum", values[4]);
    }
    
    @Test
    public void test002() {
        final String[] values = {"lorem", "ipsum", "dolor", "sit", "amet"};
        final int offset = -3;
        rotate.rotate(values, offset);
        
        assertEquals("sit", values[0]);
        assertEquals("amet", values[1]);
        assertEquals("lorem", values[2]);
        assertEquals("ipsum", values[3]);
        assertEquals("dolor", values[4]);
    }
}
