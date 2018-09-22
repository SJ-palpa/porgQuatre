import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getSurface() {
        FormGeometric rc = new Rectangle(5,9);
        Assert.assertEquals(45.0,rc.getSurface(),0);
    }
}