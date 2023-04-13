package baitap;

public class Circle {
    protected double radius ;
    protected String color;
    protected double arra;
    public Circle() {
        this.radius = 2.0;
        this.color = "màu đỏ ";

    }
    public Circle (double radius, String color, double arra) {
        this.radius = radius;
        this.color = color;
        this.arra = arra;
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

    public double getArra() {
        arra = radius * radius * Math.PI;
        return arra;
    }

    public void setArra(double arra) {
        this.arra = arra;
    }


    @Override
    public String toString(){
        return "radius: " + getRadius() +"  color: " +getColor() +"   arra: " +getArra();
    }
}
