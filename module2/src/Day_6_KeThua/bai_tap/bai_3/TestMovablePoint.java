package Day_6_KeThua.bai_tap.bai_3;

public class TestMovablePoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setXY(2, 3);
        System.out.println(point1);

        MovablePoint movablePoint1 = new MovablePoint();
        movablePoint1.setSpeed(100, 200);
        System.out.println(movablePoint1);
        movablePoint1.move();
        System.out.println(movablePoint1);
        movablePoint1.move();
        System.out.println(movablePoint1);
    }
}
