public class Client extends Person {
    // Дополнительные поля класса Client
    private String coach;
    private String tariff;
    private String expirationDate;
    private boolean isAllowed;

    public Client(String fullName, String phoneNumber, int age, String gender,
                  String coach, String tariff, String expirationDate, boolean isAllowed) {
        super(fullName, phoneNumber, age, gender);
        this.coach = coach;
        this.tariff = tariff;
        this.expirationDate = expirationDate;
        this.isAllowed = isAllowed;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean allowed) {
        isAllowed = allowed;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + getFullName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", coach='" + coach + '\'' +
                ", tariff='" + tariff + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", isAllowed=" + isAllowed +
                '}';
    }
}
