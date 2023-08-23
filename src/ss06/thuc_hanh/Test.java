package ss06.thuc_hanh;

import java.io.FilterOutputStream;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println("...");

        Retangle r = new Retangle();
        System.out.println(r);

        r = new Retangle(2.3, 5.8);
        System.out.println(r);

        r = new Retangle(2.5, 3.8, "orange", true);
        System.out.println(r);

        System.out.println("...");
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }

}
