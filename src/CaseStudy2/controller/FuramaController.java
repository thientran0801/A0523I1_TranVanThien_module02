package CaseStudy2.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("MENU: " +
                    "\n1. Employee Management" +
                    "\n2. Customer Management" +
                    "\n3. Facility Management" +
                    "\n4. Booking Management" +
                    "\n5. Promotion Management" +
                    "\n6. Exit");

            System.out.println("Enter your choice...");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select option:" +
                            "\n1. Display list employees" +
                            "\n2. Add new employee" +
                            "\n3. Edit employee" +
                            "\n4. Return main menu");
                    break;
                case 2:
                    System.out.println("Select option:" +
                            "\n1. Display list customers" +
                            "\n2. Add new custonmer" +
                            "\n3. Edit customer" +
                            "\n4. Return main menu");
                    break;
                case 3:
                    System.out.println("Select option:" +
                            "\n1. Display list facility" +
                            "\n2. Add new facility" +
                            "\n3. Display list facility maintenance" +
                            "\n4. Return main menu");
                    break;
                case 4:
                    System.out.println("Select option:" +
                            "\n1. Add new booking" +
                            "\n2. Display list booking" +
                            "\n3. Create new contracts" +
                            "\n4. DIsplay list contracts" +
                            "\n5. Edit contracts" +
                            "\n6. Return main menu");
                    break;
                case 5:
                    System.out.println("Select option:" +
                            "\n1. Display list customers use service" +
                            "\n2. Add new customers get voucher" +
                            "\n3. Return main menu");
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    //exception
                    System.out.println("Your select not valid!!!");
            }
        }while (choice != 6);

    }
}
