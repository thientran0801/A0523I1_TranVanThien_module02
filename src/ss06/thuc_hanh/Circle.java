package ss06.thuc_hanh;

import ss07.bai_tap.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;
    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String  toString() {
        return "A circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        setRadius(this.getRadius()*percent/100);
    }
}
