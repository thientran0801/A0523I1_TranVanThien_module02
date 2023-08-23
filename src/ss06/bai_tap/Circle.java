package ss06.bai_tap;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 1.0;
        this.color = "black";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "A circle with radius = " + getRadius() + " and color is " + getColor();
    }
}
