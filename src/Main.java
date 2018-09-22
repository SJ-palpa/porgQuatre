import java.util.ArrayList;

public class Main {

    public static void main (String[] args){
        System.out.println("Hello World");
        ArrayList<FormGeometric> form= new ArrayList();
        form.add(new Rectangle(5,9));
        form.add(new Rectangle(2,5));
        form.add(new Cercle(2));
        form.add(new Cercle(5));
        form.add(new Carre(2));
        form.add(new Carre(3));


        for(int i=0; form.size()>i ; i++)
        {
            System.out.println(form.get(i).getSurface());
        }

    }
}
