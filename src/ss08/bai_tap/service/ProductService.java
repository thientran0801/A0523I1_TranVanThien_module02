package ss08.bai_tap.service;

import ss08.bai_tap.model.Product;
import ss08.bai_tap.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void addProduct() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter describe: ");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, describe);
        productRepository.addProduct(product);
    }

    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println((i + 1) + (". ") + products[i]);
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the id you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductByID(id);
    }

    @Override
    public void update() {
        System.out.println("Enter id to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.updateProductList(id);
    }

    @Override
    public void search() {
        System.out.println("Enter keyword: ");
        String keyword = scanner.nextLine();
        productRepository.searchProduct(keyword);
    }
}
