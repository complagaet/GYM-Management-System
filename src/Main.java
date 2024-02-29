import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Service serv = new Service();
        Menu menu = new Menu(serv);
        menu.start();
    }
}