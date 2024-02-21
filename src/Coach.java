import java.util.ArrayList;
import java.util.List;

public class Coach extends Person {
    private String field;
    private String schedule;
    private List<Client> clients;

    public Coach(String fullName, String phoneNumber, int age, String gender,
                 String field, String schedule) {
        super(fullName, phoneNumber, age, gender);
        this.field = field;
        this.schedule = schedule;
        this.clients = new ArrayList<>();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public String toString() {
        return "Coach{" +
                "fullName='" + getFullName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", field='" + field + '\'' +
                ", schedule='" + schedule + '\'' +
                ", clients=" + clients +
                '}';
    }
}
