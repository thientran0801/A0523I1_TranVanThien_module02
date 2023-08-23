package ss06.bai_tap;

public class Point {
    private float x;
    private float y ;
    public Point(){
    }
    public Point(float x, float y) {
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
        return new float[] {this.x,  this.y};
    }
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }


    public static void main(String[] args) {

        Point point = new Point();
        System.out.println(point);

        point = new Point(15,2);
        System.out.println(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
        float[] array;
        array = point.getXY();
        System.out.println("("+ array[0] + "," + array[1] +")");
    }
}
