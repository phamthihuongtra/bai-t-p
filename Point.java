package baitap;

public class Point {
    protected float x;
    protected float y;

    //constructor không tham số
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;

        // constructor 2 tham số
    }
    public Point(float x,float y) {
        this.x = x;
        this.y = y;

    }

    // phương thức getter/setter


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
    public void setxy(float x, float y) {
        this.x = x;
        this.y = y;

    }
      // phương thức khởi tạo Mảng
    public float[] getxy() {
        return new float[]{getX(), getY()};

    }
      // phương thức ghi đè
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

