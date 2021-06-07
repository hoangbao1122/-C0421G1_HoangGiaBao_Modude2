package _04_lop_doi_tuong.baitap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(10);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("bật " + fan1.toString());
        Fan fan2 = new Fan();
        System.out.println("tắt " + fan2.toStringFalse());
    }
}
