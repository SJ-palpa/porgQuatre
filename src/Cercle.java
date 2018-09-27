public class Cercle extends FormGeometric
{

    public Cercle(int longueur,int axeX, int axeY) throws limitDepasse
    {
        super(longueur,axeX,axeY);
    }

    @Override
    public double getSurface() {
        return (longueur*longueur) * Math.PI;
    }

    public double division(double a, double b)
    {
        return a/b;
    }
}
