public class Carre extends FormGeometric
{

    public Carre(int longueur,int axeX, int axeY) throws limitDepasse
    {
        super(longueur,axeX,axeY);
    }

    @Override
    public double getSurface() {
        return longueur * longueur;
    }
}
