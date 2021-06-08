package _05_access_modifier_static_method_static_property.thuchanh.student;

public class MainStudent {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"hoang");
        Student s2 = new Student(112,"gia");
        Student s3 = new Student(113,"bao");

        s1.display();
        s2.display();
        s3.display();

    }
}
