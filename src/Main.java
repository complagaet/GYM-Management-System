import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.start();
        Service serv = new Service();
        //serv.addCoach("Gabriel Pelmen", "+77778907766", 43, "Male", "Basketball", "MON, TUE, WED");
        serv.addClient("Gabriel Pelmen", "+77778907766", 43, "Male", "Gabriel Pelmen", "BEST", "02.07.2024", true);
        /*ResultSet n f= db.load("persons", new String[] {"lastname", "firstname", "address"});
        db.displayResultSet(n);*/
    }
}