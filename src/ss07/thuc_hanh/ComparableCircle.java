package ss07.thuc_hanh;

import ss06.thuc_hanh.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getRadius() > o.getRadius()) return 1;
        else  if (this.getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
