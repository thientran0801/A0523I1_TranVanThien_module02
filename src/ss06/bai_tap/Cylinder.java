package ss06.bai_tap;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {
        super();
        this.height = 1.0;
    }
    public Cylinder( double  height) {
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = " + getRadius() + ", height = " + getHeight() + ", color: " + getColor();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(10.0, "red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(15.5);
        System.out.println(cylinder);
        cylinder = new Cylinder(23.5, 15.2, "white");
        System.out.println(cylinder);
    }
}
