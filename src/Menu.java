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
            "Show Plans", "Add Plan", "-",
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

        switch (m) {
            case 1:
                System.out.println("----- Plans: ");
                this.serv.show_plans();
                this.start();

            case 2:
                sc.nextLine();
                System.out.print("Name: ");
                String t = sc.nextLine();
                System.out.print("Cost: ");
                int a = sc.nextInt();
                this.serv.add_plan(t, a);
        }
    }

}
