package ss12.bai_tap.mvc.repository;

import ss12.bai_tap.mvc.model.Product;
import ss12.bai_tap.mvc.model.SortingByIDAscending;
import ss12.bai_tap.mvc.model.SortingByIDDecrease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Database implements IDatabase{
    private Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product("ao so mi", 01, 250000));
        productArrayList.add(new Product("ao da nam", 02, 300000));
        productArrayList.add(new Product("quan short", 04, 175000));
        productArrayList.add(new Product("quan au", 03, 200000));
    }
    @Override
    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    @Override
    public void updateProduct(int idUpdate) {
        for (Product product: productArrayList) {
            if (product.getId() == idUpdate) {
                System.out.println("Enter new Name: (old name: "+ product.getName() + " )");
                product.setName(scanner.nextLine());
                System.out.println("Enter new ID: (old ID: "+ product.getId() + " )");
                product.setId(scanner.nextInt());
                System.out.println("Enter new Price: (old price: "+ product.getPrice() + " )");
                product.setPrice(scanner.nextInt());
                System.out.println("Update successul!");
                return;
            }
        }
        System.out.println("ID not found !!!");
    }

    @Override
    public ArrayList<Product> getProductList() {
        return productArrayList;
    }

    @Override
    public void searchProduct() {

    }

    @Override
    public void deleteProduct(int idDelete) {
        for (Product product: productArrayList) {
            if (product.getId() == idDelete) {
                productArrayList.remove(product);
                System.out.println("Deleted !");
                return;
            }
        }
        System.out.println("ID not found !!!");
    }

    @Override
    public void sortingProduct(int choice) {
        if (choice == 1) {
            Comparator comparator = new SortingByIDAscending();
            Collections.sort(productArrayList, comparator);
        }else {
            Comparator comparator = new SortingByIDDecrease();
            Collections.sort(productArrayList, comparator);
        }
        System.out.println("Sorted !");
    }
}
