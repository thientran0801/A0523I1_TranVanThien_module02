package ss08.bai_tap.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, int price, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product with: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                '.';
    }
}
