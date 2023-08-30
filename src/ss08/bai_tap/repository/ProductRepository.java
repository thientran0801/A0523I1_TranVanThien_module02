package ss08.bai_tap.repository;

import ss08.bai_tap.model.Product;

public class ProductRepository implements IProductRepository{
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
    public void updateProductList() {

    }

    @Override
    public Product searchProduct() {
        return null;
    }
}
