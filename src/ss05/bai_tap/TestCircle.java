package ss05.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(50);
        System.out.println("Radius of the circle is: " + circle1.getRadius() + " m");
        System.out.println("Arera of the circle is: " + Math.round(circle1.getArea()) + " m\u00B2");
    }
}
