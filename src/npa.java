public class npa {
    int id;
    int code;
    String localite;

    public npa(int id, int code, String localite)
    {
        this.id= id;
        this.code = code;
        this.localite = localite;
    }

    public npa(int id)
    {
        this.id= id;
    }

    @Override
    public String toString() {
        return "Le code postal de la ville " + localite + " est " + code;
    }
}
