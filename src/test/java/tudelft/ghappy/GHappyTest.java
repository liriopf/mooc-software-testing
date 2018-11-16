package tudelft.ghappy;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void createGHappy(){
        happy = new GHappy();
    }

    @Test
    public void testHappy(){
        Assertions.assertTrue(happy.gHappy("xxggxx"));
    }

    @Test
    public void testUnHappy() {
        Assertions.assertFalse(happy.gHappy("xxgxx"));
    }

    @Test
    public void testNotAllHappy() {
        Assertions.assertFalse(happy.gHappy("xxggyygxx"));
    }

    @Test
    public void testAllHappy() {
        Assertions.assertTrue(happy.gHappy("gg"));
    }
}
