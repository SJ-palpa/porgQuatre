public class Carre extends FormGeometric
{

    public Carre(int longueur)
    {
        super(longueur);
    }

    @Override
    public double getSurface() {
        return longueur * longueur;
    }
}
