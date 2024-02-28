import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Service serv = new Service();
        Menu menu = new Menu(serv);
        menu.start();
        //serv.addCoach("Gabriel Pelmen", "+77778907766", 43, "Male", "Basketball", "MON, TUE, WED");
        serv.addClient("Abrikos", "+999999999", 456, "Helicopter", "Gabriel Pelmen", "0", "02.07.9999", true);
        /*ResultSet n f= db.load("persons", new String[] {"lastname", "firstname", "address"});
        db.displayResultSet(n);*/
    }
}