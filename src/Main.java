import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database db = new Database("jdbc:postgresql://localhost:5432/postgres", "postgres", "275427");
        db.init();
        ResultSet n = db.load("persons", new String[] {"lastname", "firstname", "address"});
        db.displayResultSet(n);
    }
}