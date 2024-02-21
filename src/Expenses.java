public class Expenses {
    private double salary;
    private double utilities;
    private double rent;
    private double equipment;

    public Expenses(double salary, double utilities, double rent, double equipment) {
        this.salary = salary;
        this.utilities = utilities;
        this.rent = rent;
        this.equipment = equipment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getUtilities() {
        return utilities;
    }

    public void setUtilities(double utilities) {
        this.utilities = utilities;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getEquipment() {
        return equipment;
    }

    public void setEquipment(double equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "salary=" + salary +
                ", utilities=" + utilities +
                ", rent=" + rent +
                ", equipment=" + equipment +
                '}';
    }
}