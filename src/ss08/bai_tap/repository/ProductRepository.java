package ss08.bai_tap.repository;

import ss08.bai_tap.model.Product;

import java.util.Scanner;

public class ProductRepository implements IProductRepository{
    Scanner scanner = new Scanner(System.in);
    private Product[] products = new Product[100];
    @Override
    public Product[] getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product  product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    @Override
    public void deleteProductByID(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                for (int j = i; j < products.length-1; j++) {
                    products[j] = products[j+1];
                }
                products[products.length-1] = null;
                break;
            }
        }
    }

    @Override
    public void updateProductList(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.println("Enter new price: ");
                int newPrice = Integer.parseInt(scanner.nextLine());
                System.out.println("Edit describe: ");
                String newDescribe = scanner.nextLine();
                products[i].setName(newName);
                products[i].setPrice(newPrice);
                products[i].setDescribe(newDescribe);
                break;
            }
        }
    }

    @Override
    public void searchProduct(String  keyword) {
        int numberChar = keyword.length();
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().contains(keyword)) {
                System.out.println(products[i]);
                break;
            }
        }
    }
}
