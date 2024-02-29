import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private final Database db = new Database("jdbc:postgresql://localhost:5432/GYMMS", "postgres", "275427");
    private final List<Person> people = new ArrayList<>();
    public static void main(String[] args) throws SQLException {
        String action = "INIT_PROJ";

        if (action.equals("INIT_PROJ")) {
            Database db = new Database("jdbc:postgresql://localhost:5432/GYMMS", "postgres", "275427");
            db.init();
            db.createTable(
                "plans",
                new String[] { "id", "name", "cost" },
                new String[] { "integer", "text", "integer" },
                "id"
            );
            db.createTable(
                "client",
                new String[] { "id", "fullName", "phoneNumber", "age", "gender", "coach", "tariff", "expirationDate", "isAllowed" },
                new String[] { "integer", "text", "text", "integer", "text", "text", "integer", "text", "boolean" },
                "id"
            );
            db.createTable(
                "coach",
                new String[] { "id", "fullName", "phoneNumber", "age", "gender", "field", "schedule" },
                new String[] { "integer", "text", "text", "text", "text", "text", "text" },
                "id"
            );
        }
    }
    public void addCoach(String fullName, String phoneNumber, int age, String gender, String field, String schedule) throws SQLException {
        db.init();
        people.add(new Coach(fullName, phoneNumber, age, gender, field, schedule));
        db.save(
            "coach",
            new String[] { "fullName", "phoneNumber", "age", "gender", "field", "schedule" },
            new String[] { fullName, phoneNumber, String.valueOf(age), gender, field, schedule }
        );
        System.out.println("[COACH] " + fullName + " added!");
    }
    public void addClient(String fullName, String phoneNumber, int age, String gender,
                          String coach, String tariff, String expirationDate, boolean isAllowed) throws SQLException {
        db.init();
        people.add(new Client(fullName, phoneNumber, age, gender, coach, tariff, expirationDate, isAllowed));
        db.save(
            "client",
            new String[] { "fullName", "phoneNumber", "age", "gender", "coach", "tariff", "expirationDate", "isAllowed" },
            new String[] { fullName, phoneNumber, String.valueOf(age), gender, coach, tariff, expirationDate, String.valueOf(isAllowed)}
        );
        System.out.println("[CLIENT] " + fullName + " added!");
    }

    public void add_plan(String name, int cost) throws SQLException {
        db.init();
        db.save(
            "plans",
            new String[] { "name", "cost" },
            new String[] { name, String.valueOf(cost)}
        );
        System.out.println("[PLAN] " + name + " added!");
    }

    public int show_plans() throws SQLException {
        db.init();
        ResultSet n = db.load("plans", new String[] { "id", "name", "cost" });
        System.out.println("----- Plans: ");
        return db.displayResultSet(n);
    }

    public int show_coaches() throws SQLException {
        db.init();
        ResultSet n = db.load("coach", new String[] { "id", "fullname", "field", "schedule" });
        System.out.println("----- Coaches: ");
        return db.displayResultSet(n);
    }
}
