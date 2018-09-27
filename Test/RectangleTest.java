import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {


    @Test
    public void getSurface()  throws limitDepasse{
        FormGeometric rc = new Rectangle(5,12,12,9);
        Assert.assertEquals(45.0,rc.getSurface(),0);
    }

    @Test(expected  =  IllegalArgumentException.class)
    public void exeptionLongueur() throws limitDepasse {
        new Rectangle(-2,45,54,52);
    }

    @Test(expected  =  IllegalArgumentException.class)
    public void exeptionLargeur() throws limitDepasse {
        new Rectangle(2,54,21,-52);
    }

    @Test(expected  =  limitDepasse.class)
    public void exeptionCanvasX() throws limitDepasse {
        new Rectangle(2,-501,241,52);
    }

    @Test(expected  =  limitDepasse.class)
    public void exeptionCanvasY() throws limitDepasse {
        new Rectangle(2,45,-501,52);
    }
}