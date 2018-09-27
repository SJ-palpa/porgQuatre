import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CercleTest {
    @Test
    public void getSurface() throws limitDepasse{
        FormGeometric rc = new Cercle(2,121,211);
        Assert.assertEquals(12.5,rc.getSurface(),0.5);
    }
    @Test(expected  =  IllegalArgumentException.class)
    public void exeptionLongueur() throws limitDepasse {
        new Cercle(-2,12,213);
    }

    @Test(expected  =  limitDepasse.class)
    public void exeptionCanvasX() throws limitDepasse {
        new Cercle(2,-501,241);
    }

    @Test(expected  =  limitDepasse.class)
    public void exeptionCanvasY() throws limitDepasse {
        new Cercle(2,45,-501);
    }
}