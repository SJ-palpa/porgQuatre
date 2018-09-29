import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PersonneTest {
    List<Personne> l = new ArrayList<>();

    @Before
    public void init()
    {
        l.add(new Personne(5,"jacque"));
        l.add(new Personne(2,"robert"));
        l.add(new Personne(8,"robert"));
        l.add(new Personne(4,"gui"));
        l.add(new Personne(9,"martial"));
        l.add(new Personne(6,"garri"));
    }


    @Test
    public void testEquals()
    {
        Assert.assertEquals(true,l.get(1).equals(l.get(2)));
    }

    @Test
    public void testString()
    {

        for(int i = 0; l.size()> i ; i++)
        {
            System.out.println(l.get(i).toString());
        }
        Assert.assertEquals("robert",l.get(1).toString());
    }

    @Test
    public void testComparableFct()
    {
        Collections.sort(l);
        List<Personne> x = new ArrayList<>();
        x.add(new Personne(2,"robert"));
        x.add(new Personne(4,"gui"));
        x.add(new Personne(5,"jacque"));
        x.add(new Personne(6,"garri"));
        x.add(new Personne(8,"robert"));
        x.add(new Personne(9,"martial"));
        Assert.assertEquals(l,x);
    }

    @Test
    public void testComparableFctPas()
    {
        Collections.sort(l);
        List<Personne> x = new ArrayList<>();
        x.add(new Personne(2,"robert"));
        x.add(new Personne(4,"gui"));
        x.add(new Personne(5,"jacque"));
        x.add(new Personne(8,"robert"));
        x.add(new Personne(6,"garri"));
        x.add(new Personne(9,"martial"));
        Assert.assertNotEquals(l,x);
    }
}