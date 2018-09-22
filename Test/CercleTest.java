import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CercleTest {

    @Test
    public void getSurface() {
        FormGeometric rc = new Cercle(2);
        Assert.assertEquals(12.5,rc.getSurface(),0.5);
    }
}