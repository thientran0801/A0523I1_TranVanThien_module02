package ss08.bai_tap.controller;

import ss08.bai_tap.service.ProductService;

import java.util.Scanner;
public class ProductController {
    public static void displayMenu() {
        ProductService productService = new ProductService();
//        boolean isChoice = true;
        int choice = -1;
        Scanner scanner  = new Scanner(System.in);
        do {
            System.out.println("Select function: ");
            System.out.println(
                    " 1. Display all products" +
                    "\n 2. Add product" +
                    "\n 3. Delete product" +
                    "\n 4. Update product" +
                    "\n 5. Search" +
                    "\n 6. Exit ");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Display function: ");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Additional function: ");
                    productService.addProduct();
                    break;
                case 3:
                    System.out.println("Delete by id function: ");
                    productService.delete();
                    break;
                case 4:
                    System.out.println("Update function: ");
                    productService.update();
                    break;
                case 5:
                    System.out.println("Search function: ");
                    productService.search();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Your select is not valid..!");
            }
        }while (choice != 6);
    }
}
