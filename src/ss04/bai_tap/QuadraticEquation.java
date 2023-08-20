package ss04.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4*this.a*this.c;
    }
    public Double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant()))/2*this.a;
    }
    public Double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant()))/2*this.a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solve quadratic equations of the form: ax\u00B2 + bx + c = 0 ");
//        System.out.println("Solve quadratic equations of the form: ax\u2083 + bx + c = 0 ");
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Discriminant of the equation is: " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        }else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has two root: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }else {
            System.out.println("The equation has no real roots! ");
        }
    }
}
