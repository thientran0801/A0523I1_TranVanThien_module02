package CaseStudy2.controller;

import CaseStudy2.model.Employee;
import sun.security.krb5.internal.KdcErrException;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
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

    public void employeeController() {
        Employee employee = new Employee();
        int choice = 0;
        do {
            System.out.println("Select option:" +
                    "\n1. Display list employees" +
                    "\n2. Add new employee" +
                    "\n3. Edit employee" +
                    "\n4. Return main menu");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Your choice not valid !!!");
            }
        }while (choice != 4);
    }

    public void customerController() {

    }

    public void facilityController() {

    }

    public void bookingController() {

    }

    public void promotionController() {

    }
}
