package ss06.thuc_hanh;

import ss07.bai_tap.Colorable;
import ss07.bai_tap.Resizeable;

public class Square extends Retangle implements Resizeable, Colorable {
    public Square(){
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "A square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        setSide(this.getSide()*percent/100);
    }
    @Override

public void howToColor() {
        System.out.print("Color all four side!...");
    }
}
