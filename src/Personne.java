public class Personne implements Comparable{

    Long id;
    String name;

    public Personne(long id, String name)
    {
        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Personne)obj).name);
    }

    public String toString()
    {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Personne)o).id);

        //return this.name.compareTo(((Personne)o).name);
    }
}
