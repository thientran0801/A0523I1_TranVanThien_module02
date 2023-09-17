package ss12.bai_tap.repository;

import ss12.bai_tap.model.Product;

import java.util.ArrayList;

public interface IDatabase {
    void addProduct(Product product);
    void updateProduct(int idUpdate);
    ArrayList<Product> getProductList();
    void searchProduct();
    void deleteProduct(int idDelete);
    void sortingProduct(int choice);
}
