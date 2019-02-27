package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

    @Test
    public void testJoin() {
        assertEquals("Joined string didn't match", "1 2 3", Example.join("1", "2", "3"));
    }

    @Test
    public void testaddNumbers(){
        assertTrue(Example.addNumbers(5 , 5) == 10);
    }
}
