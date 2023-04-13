package baitap;

public class Cylinder extends Circle{
    protected double height;
    public Cylinder() {
        this.height = 3.0;

    }
    public Cylinder(double radius, String color, double  arra, double height) {
        super (radius, color, arra);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return  arra * height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", volume=" + getVolume() +
                '}' + super.toString();
    }
}

