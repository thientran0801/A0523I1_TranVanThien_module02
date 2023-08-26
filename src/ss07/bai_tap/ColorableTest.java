package ss07.bai_tap;

import ss06.thuc_hanh.Circle;
import ss06.thuc_hanh.Retangle;
import ss06.thuc_hanh.Shape;
import ss06.thuc_hanh.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.2, "red", true);
        shapes[1] = new Retangle(60.2, 45.3, "green", true);
        shapes[2] = new Square(40.25, "red", true);

        for (Shape shape: shapes) {
            if (shape instanceof Circle) {
                System.out.print("A circle with area: " + ((Circle) shape).getArea());
            }else if (shape instanceof Square) {
                System.out.print("A square with area: " + ((Square) shape).getArea());
            }else System.out.print("A rectangle with area: " + ((Retangle) shape).getArea());
            if (shape instanceof Colorable) {
                System.out.print(" and ");
                ((Colorable) shape).howToColor();
            }
            System.out.println();
        }
    }
}
