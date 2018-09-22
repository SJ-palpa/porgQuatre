public class Rectangle extends FormGeometric
{
    int largeur;

    public Rectangle(int longueur,int largeur )
    {
        super(longueur); this.largeur=largeur;
    }

    @Override
    public double getSurface() {
        return longueur*largeur;
    }
}
