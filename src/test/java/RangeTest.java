import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RangeTest {
    @Test
    public void isInclusiveWithBucketShouldBeTrue() {
        Range range = new Range("[1,5]");
        boolean actual = range.isStartWithInclusive();
        assertTrue(actual);
    }
    
    @Test
    public void getStartInput(){
        Range range = new Range("[1,5]");
        int actual = range.getStartInput();
        assertEquals(1,actual);
    }

    @Test
    public void isEndWithInclusiveWithBucketShouldBeTrue() {
        Range range = new Range("[1,5]");
        boolean actual = range.isEndWithInclusive();
        assertTrue(actual);
    }
    
    @Test
    public void getEndInput(){
        Range range = new Range("[1,5]");
        int actual = range.getEndInput();
        assertEquals(5,actual);
    }
}
