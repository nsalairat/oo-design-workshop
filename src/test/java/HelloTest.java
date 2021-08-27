import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
    @Test
    public  void testHello(){
        Hello hello = new Hello();
        String actual = hello.greeting("ddd");
        assertEquals("Hello ddd", actual);
    }
}
