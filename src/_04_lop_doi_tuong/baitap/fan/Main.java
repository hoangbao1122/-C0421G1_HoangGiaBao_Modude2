package _04_lop_doi_tuong.baitap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.getOn();
        fan1.setRadius(10);
        fan1.setSpeed(2);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.getOff();
        System.out.println(fan2.toString());
    }
}
