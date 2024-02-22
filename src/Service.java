import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private final Database db = new Database("jdbc:postgresql://localhost:5432/GYMMS", "postgres", "275427");
    private final List<Person> people = new ArrayList<>();
    public void addCoach(String fullName, String phoneNumber, int age, String gender, String field, String schedule) throws SQLException {
        db.init();
        people.add(new Coach(fullName, phoneNumber, age, gender, field, schedule));
        db.save(
                "\"COACH\"",
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
                "\"CLIENT\"",
                new String[] { "fullName", "phoneNumber", "age", "gender", "coach", "tariff", "expirationDate", "isAllowed" },
                new String[] { fullName, phoneNumber, String.valueOf(age), gender, coach, tariff, expirationDate, String.valueOf(isAllowed)}
        );
        System.out.println("[CLIENT] " + fullName + " added!");
    }

}
