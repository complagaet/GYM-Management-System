import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);
    private final Service serv;
    Menu(Service serv) {
        this.serv = serv;
    }
    public void start() throws SQLException {
        System.out.println("*********************** MENU **********************");
        String[] menu = {
            "Show Plans", "New Plan", "-",
            "Show Clients", "Show Coaches", "Show Expenses", "-",
            "New Client", "New Coach", "-",
            "Exit"
        };
        for (int i = 0, c = 1; i < menu.length; i++) {
            if (menu[i].equals("-")) {
                System.out.println("---------");
            } else {
                System.out.println(c + ": " + menu[i]);
                c++;
            }
        }

        System.out.print("\n--> ");
        int m = sc.nextInt();
        System.out.println("***************************************************");
        try {
            switch (m) {
                case 1:
                    this.serv.show_plans();
                    this.start();

                case 2:
                    System.out.println("----- New Plan: ");
                    sc.nextLine();
                    System.out.print("Name: ");
                    String t = sc.nextLine();
                    System.out.print("Cost: ");
                    int a = sc.nextInt();
                    this.serv.add_plan(t, a);
                    this.start();

                case 3:
                    this.serv.show_clients();
                    this.start();

                case 4:
                    this.serv.show_coaches();
                    this.start();

                case 6:
                    System.out.println("----- New Client: ");
                    sc.nextLine();
                    System.out.print("FullName: ");
                    String fullName = sc.nextLine();
                    System.out.print("Phone: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Age: ");
                    String age = sc.nextLine();
                    System.out.print("Gender: ");
                    String gender = sc.nextLine();

                    int maxCoachId = this.serv.show_coaches();
                    System.out.print("Coach ID (Max ID is " + maxCoachId + "): ");
                    String coach = sc.nextLine();

                    int maxPlanId = this.serv.show_plans();
                    System.out.print("Plan ID (Max ID is " + maxPlanId + "): ");
                    String plan = sc.nextLine();

                    System.out.print("Expires: ");
                    String expirationDate = sc.nextLine();
                    System.out.print("Allowed?: ");
                    String isAllowed = sc.nextLine();
                    this.serv.addClient(fullName, phoneNumber, Integer.parseInt(age), gender, coach, plan, expirationDate, Boolean.parseBoolean(isAllowed));
                    this.start();

                case 7:
                    System.out.println("----- New Coach: ");
                    sc.nextLine();
                    System.out.print("FullName: ");
                    fullName = sc.nextLine();
                    System.out.print("Phone: ");
                    phoneNumber = sc.nextLine();
                    System.out.print("Age: ");
                    age = sc.nextLine();
                    System.out.print("Gender: ");
                    gender = sc.nextLine();
                    System.out.print("Field: ");
                    String field = sc.nextLine();
                    System.out.print("Schedule: ");
                    String schedule = sc.nextLine();

                    this.serv.addCoach(fullName, phoneNumber, Integer.parseInt(age), gender, field, schedule);
                    this.start();

                case 8:
                    System.exit(0);
            }
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Exception! " + e);
        } finally {
            this.start();
        }
    }

}
