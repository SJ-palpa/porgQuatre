public class Rectangle extends FormGeometric
{
    int largeur;

    public Rectangle(int longueur,int axeX, int axeY,int largeur ) throws limitDepasse
    {
        super(longueur,axeX,axeY);
        if (largeur < 0)
        {
            throw new IllegalArgumentException("largeur fausse");
        }
        this.largeur=largeur;
    }



    @Override
    public double getSurface() {
        return longueur*largeur;
    }
}
