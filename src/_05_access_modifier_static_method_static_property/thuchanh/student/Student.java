package _05_access_modifier_static_method_static_property.thuchanh.student;



public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = " codegyn";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
