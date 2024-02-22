import java.util.Scanner;

public class Menu {
    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************** MENU **********************");
        String[] menu = {
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
    }
}
