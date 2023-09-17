package ss12.bai_tap.mvc.model;

import java.util.Comparator;

public class SortingByIDDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
