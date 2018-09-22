import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarreTest {

    @Test
    public void getSurface() {
        FormGeometric rc = new Carre(2);
        Assert.assertEquals(4.0,rc.getSurface(),0.5);
    }
}