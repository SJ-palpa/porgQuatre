import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarreTest {

    @Test
    public void getSurface()  throws limitDepasse{
        FormGeometric rc = new Carre(2,52,51);
        Assert.assertEquals(4.0,rc.getSurface(),0.5);
    }

    @Test(expected  =  IllegalArgumentException.class)
    public void exeptionLongueur() throws limitDepasse {
        new Carre(-2,45,241);
    }

    @Test(expected  =  limitDepasse.class)
    public void exeptionCanvasX()  throws limitDepasse{
        new Carre(2,-501,241);
    }

    @Test(expected  =  limitDepasse.class)
    public void exeptionCanvasY() throws limitDepasse {
        new Carre(2,45,-501);
    }
}