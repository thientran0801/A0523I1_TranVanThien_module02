package ss08.bai_tap.repository;

import ss08.bai_tap.model.Product;

public interface IProductRepository {
    Product[] getListProduct();
    void addProduct(Product product);
    void deleteProductByID(int id);
    void updateProductList();
    Product searchProduct();
}
