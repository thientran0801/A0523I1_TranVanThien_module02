package ss08.bai_tap.service;

import ss08.bai_tap.model.Product;
import ss08.bai_tap.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private int price;
    private String describe;
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void addProduct() {
        System.out.println("Enter id: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter price: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter describe: ");
        describe = scanner.nextLine();
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
        id = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductByID(id);
    }

    @Override
    public void update() {
        System.out.println("Enter id to update: ");
        id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter name: ");
//        name = scanner.nextLine();
//        System.out.println("Enter price: ");
//        price = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter describe: ");
//        describe = scanner.nextLine();
//        Product product = new Product(id, name, price, describe);
        productRepository.updateProductList(id);
    }

    @Override
    public void search() {
        System.out.println("Enter keyword: ");
        String keyword = scanner.nextLine();
        productRepository.searchProduct(keyword);
    }
}
