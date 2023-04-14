package baitap;

public class MovablePoint extends Point{
    protected float xSpeed;
    protected float ySpeed;
    public MovablePoint(float xSpeed, float ySpeed) {
        super(xSpeed, ySpeed);

    }
    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;

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
    public void setSpedd(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getxSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + "," + "xs: "+ xSpeed + "ys: "+ ySpeed +")";

    }
    public MovablePoint move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
