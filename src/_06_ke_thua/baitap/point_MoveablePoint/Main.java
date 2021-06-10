package _06_ke_thua.baitap.point_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1,2);

        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        movablePoint.setSpeed(6,70);
        movablePoint.move();

        System.out.println(movablePoint.toString());

    }
}
