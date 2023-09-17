package ss12.bai_tap.mvc.service;

import ss12.bai_tap.mvc.model.Product;
import ss12.bai_tap.mvc.repository.Database;
import ss12.bai_tap.mvc.repository.IDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceProduct implements IServiceProduct{
    private IDatabase database = new Database();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addProduct() {
        System.out.println("Enter Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter ID: ");
        int newID = scanner.nextInt();
        System.out.println("Enter Price: ");
        int newPrice = scanner.nextInt();

        Product newproduct = new Product(newName, newID, newPrice);
        database.addProduct(newproduct);
    }

    @Override
    public void updateProduct() {
        System.out.println("Enter the product ID you want to edit: ");
        int idEdit = scanner.nextInt();
        database.updateProduct(idEdit);
    }

    @Override
    public void displayProductList() {
        ArrayList<Product> list = database.getProductList();
        for (Product product: list) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct(String string) {
        ArrayList<Product> list = database.getProductList();
        for (Product product: list) {
            if (product.getName().toLowerCase().contains(string.toLowerCase())) {
                System.out.println(product.getName());
            }
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter the product ID you want to delete: ");
        int idEdit = scanner.nextInt();
        database.deleteProduct(idEdit);
    }

    @Override
    public void sortingProduct() {
        int choice;
        do {
            System.out.println("1. Ascending" +
                    "\n2. Decrease" +
                    "\nEnter your choice: ");
           choice = scanner.nextInt();
            if (choice <1 || choice > 2) {
                System.out.println("Your choice not valid !!!");
            }
        }while (choice <1 || choice > 2);
        database.sortingProduct(choice);
    }
}
