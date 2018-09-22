public class Cercle extends FormGeometric
{

    public Cercle(int longueur)
    {
        super(longueur);
    }

    @Override
    public double getSurface() {
        return (longueur*longueur) * Math.PI;
    }
}
