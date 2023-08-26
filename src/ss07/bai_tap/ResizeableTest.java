package ss07.bai_tap;

import ss06.thuc_hanh.Circle;
import ss06.thuc_hanh.Retangle;
import ss06.thuc_hanh.Shape;
import ss06.thuc_hanh.Square;

import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10.0, "blue", true);
        shapes[1] = new Retangle(10.0, 20.0);
        shapes[2] = new Square(25.0, "green", true);

        System.out.println("Area before scale: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle.getArea());
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.getArea());
                continue;
            }
            if (shape instanceof Retangle) {
                Retangle retangle = (Retangle) shape;
                System.out.println(retangle.getArea());
            }
        }

        System.out.println("Enter a scale: ");
        int sc = scanner.nextInt();


        System.out.println("Area after scale: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.resize(sc);
                System.out.println(circle.getArea());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                square.resize(sc);
                System.out.println(square.getArea());
            } else if (shape instanceof Retangle) {
                Retangle retangle = (Retangle) shape;
                retangle.resize(sc);
                System.out.println(retangle.getArea());
            }
            System.out.println(shape);

        }
    }
}
