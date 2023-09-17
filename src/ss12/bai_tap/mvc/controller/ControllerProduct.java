package ss12.bai_tap.mvc.controller;

import ss12.bai_tap.mvc.service.ServiceProduct;

import java.util.Scanner;

public class ControllerProduct {
    public static void displayMenu() {
        ServiceProduct serviceProduct = new ServiceProduct();
        Scanner scanner = new Scanner(System.in);
        int yourChoice = -1;


        while (yourChoice != 0 ) {
            System.out.println("MENU: " +
                    "\n 0. Exit" +
                    "\n 1. Display product" +
                    "\n 2. Addition products" +
                    "\n 3. Edit by id" +
                    "\n 4. Delete by id" +
                    "\n 5. Search product" +
                    "\n 6. Sorting product");

            System.out.println("Enter your choice: ");
            yourChoice = scanner.nextInt();
            System.out.println();


            switch (yourChoice) {
                case 0:
                    System.out.println("See you soon!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Display function: ");
                    serviceProduct.displayProductList();
                    break;
                case 2:
                    System.out.println("Add function: ");
                    serviceProduct.addProduct();
                    break;
                case 3:
                    System.out.println("Edit function: ");
                    serviceProduct.updateProduct();
                    break;
                case 4:
                    System.out.println("Delete function: ");
                    serviceProduct.deleteProduct();
                    break;
                case 5:
                    System.out.println("Search function: ");
                    System.out.println("which product do you want to search for???");
                    scanner.nextLine();
                    String keyWord = scanner.nextLine();
                    serviceProduct.searchProduct(keyWord);
                    break;
                case 6:
                    System.out.println("Sorting function: ");
                    serviceProduct.sortingProduct();
                    break;
                default:
                    System.out.println("Your choice is invalid !");
//                    throw new IllegalStateException("Unexpected value: " + yourChoice);
            }
        }
    }
}
