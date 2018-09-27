public abstract class FormGeometric {

    private final int canvaX = 500;
    private final int canvaY = 500;
    double longueur ;
    private int axeX =0;
    private int axeY =0;

    public FormGeometric(int longueur,int axeX, int axeY) throws limitDepasse{
        if (longueur < 0 )
        {
            throw new IllegalArgumentException("longueur fausse");
        }
        this.longueur = longueur;
        this.changeAxeX(axeX);
        this.changeAxeY(axeY);
    }

    public void changeAxeX(int valeur) throws limitDepasse
    {
        if (0 >  axeX+valeur || canvaX < axeX+valeur )
        {
            throw new limitDepasse();
        }
       axeX= axeX+valeur;
    }

    public void changeAxeY(int valeur) throws limitDepasse
    {
        if (0 >  axeY+valeur ||canvaY < axeY+valeur )
        {
            throw new limitDepasse();
        }
        axeY= axeY+valeur;
    }

    public abstract double getSurface();


}

