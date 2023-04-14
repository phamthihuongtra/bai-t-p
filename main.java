package baitap;

public class main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxy(1f, 2f);
        movablePoint.setSpedd(2.3f, 3.6f);
        System.out.println(movablePoint.move());
    }
}
