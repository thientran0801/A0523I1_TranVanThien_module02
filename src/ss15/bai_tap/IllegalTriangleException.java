package ss15.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String message) {
        super(message);
    }
}


class Triangle {
    public static void checkSide(int a, int b, int c) throws IllegalTriangleException{
        if (a<= 0 || b <=0 || c<= 0 || a+b < c || b+c < a || c+a<b) {
            throw new IllegalTriangleException("Are not the side of a triangle !!!");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int a, b, c;
        do {
            System.out.println("Enter side a: ");
            a = scanner.nextInt();
            System.out.println("Enter side b: ");
            b = scanner.nextInt();
            System.out.println("Enter side c: ");
            c = scanner.nextInt();
            try {
                Triangle.checkSide(a, b, c);
                flag = false;
            }catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }while (flag);
        System.out.println("a = " + a+ ", b = " +b+", c = " + c +" are three sides of the triangle...");
        System.out.println("Done");
    }
}
