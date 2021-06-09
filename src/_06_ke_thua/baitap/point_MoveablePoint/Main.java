package _06_ke_thua.baitap.point_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1,2);
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(6,7);

        System.out.println(movablePoint.toString());

    }
}
