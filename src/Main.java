import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) throws limitDepasse{
        System.out.println("Hello World");
        ArrayList<FormGeometric> form= new ArrayList();
        form.add(new Rectangle(5,10,30,9));
        form.add(new Rectangle(2,11,56,5));
        form.add(new Cercle(2,48,57));
        form.add(new Cercle(5,92,455));
        form.add(new Carre(2,244,298));
        form.add(new Carre(3,237,654));


        for(int i=0; form.size()>i ; i++)
        {
            System.out.println(form.get(i).getSurface());
        }
        System.out.println(((Cercle)form.get(3)).division(0.0,7.0));






        // Connexion à la base de données !

        ArrayList<npa> npaListe = new ArrayList();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Connection cn = mysql.Outils.connect("bddtest");
            System.out.println("Driver Ok");
            stmt = cn.createStatement();
            if ( stmt.execute("SELECT npa_id FROM npa ")) {
                rs = stmt.getResultSet();
            }
            while (rs.next())
            {
                int id = rs.getInt("npa_id");
                System.out.println(id);
                //int code = rs.getInt("npa_code");
               // String localite = rs.getString("npa_localite");
                npaListe.add(new npa(id));
            }
        }
        catch(SQLException ex)
        {
            ex.getSQLState();
        }
        catch (ClassNotFoundException exCla)
        {
            exCla.getException();
        }
        finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
        for (int i = 0; npaListe.size()> i ; i++)
        {
            System.out.println(npaListe.get(i));
        }
    }
}
