package ss12.bai_tap.mvc.repository;

import ss12.bai_tap.mvc.model.Product;

import java.util.ArrayList;

public interface IDatabase {
    void addProduct(Product product);
    void updateProduct(int idUpdate);
    ArrayList<Product> getProductList();
    void searchProduct(String string);
    void deleteProduct(int idDelete);
    void sortingProduct(int choice);
}
