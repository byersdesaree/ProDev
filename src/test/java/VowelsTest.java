
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VowelsTest {
    Vowels vw;

    @Before
    public void setUp(){
        vw = new Vowels();
    }

    @Test
    public void testCountVowels(){
        assertEquals(4, vw.countVowels("w3resource"));
    }


}
