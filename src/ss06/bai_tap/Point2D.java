package ss06.bai_tap;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[] {this.x, this.y};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), this.getZ()};
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.getZ() + ")";
    }
//Test


    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(0.5f, 4.2f, 6.5f);
        System.out.println(point3D);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        point3D.setX(10.5f);
        point3D.setY(9.6f);
        point3D.setZ(10.5f);
        point3D.setX(9.7f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        point3D.setXYZ(5.2f, 6.3f, 2.3f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
