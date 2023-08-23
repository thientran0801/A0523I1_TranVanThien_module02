package ss06.bai_tap;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ") , speed = (" + getXSpeed() + ", " + getYSpeed() + ")";
    }

    public MovablePoint move() {
        setX(super.getX() + this.xSpeed);
        setY(super.getY() + this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(20.5f, 15.7f);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(5.2f, 3.5f, 45.03f, 36.3f);
        movablePoint.setY(0.5f);
        movablePoint.setX(0.5f);
        movablePoint.setXY(0.5f, 8.5f);
        movablePoint.setXSpeed(0.5f);
        movablePoint.setYSpeed(0.5f);
        movablePoint.setXY(0.6f, 0.78f);
        movablePoint.move();
        System.out.println(movablePoint.getY());
        System.out.println(movablePoint.getX());
        System.out.println(Arrays.toString(movablePoint.getXY()));
        System.out.println(movablePoint.getXSpeed());
        System.out.println(movablePoint.getYSpeed());
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        System.out.println(movablePoint.getX());
        System.out.println(movablePoint);
    }
}
