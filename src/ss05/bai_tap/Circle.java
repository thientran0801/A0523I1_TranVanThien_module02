package ss05.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double r) {
        this.radius = r;
    }
    protected double getRadius(){
        return this.radius;
    }
    double getArea() {
        return 2*Math.PI*radius;
    }
}
