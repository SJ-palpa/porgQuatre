import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class contenuArrayTest {
    ArrayList<FormGeometric> form = new ArrayList();
    @Before
    public void before()  throws limitDepasse {

        form.add(new Rectangle(5,32,32,9));
        form.add(new Rectangle(2,23,32, 5));
        form.add(new Cercle(2,23,32));
        form.add(new Cercle(5,23,23));
        form.add(new Cercle(5,23,23));
        form.add(new Carre(2,23,23));
        form.add(new Carre(3,23,23));
    }
    @Test
    public void testArrayContenu() {
        int rec = 0;
        int cercle = 0;
        int car = 0;

        for (int i = 0; form.size() > i; i++)
        {
            if(form.get(i) instanceof Rectangle)
            {
                rec++;
            }
            else if (form.get(i) instanceof Cercle)
            {
                cercle++;
            }
            else if (form.get(i) instanceof Carre)
            {
                car++;
            }
        }
        Assert.assertEquals(2,rec);
        Assert.assertEquals(2,car);
        Assert.assertEquals(3,cercle);
    }
}