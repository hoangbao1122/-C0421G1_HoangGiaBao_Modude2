package _05_access_modifier_static_method_static_property.baitap.lop_ghi;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
        student.setName("gia");
        student.setClasser("C2421G1");
        System.out.println(student.toString());
    }
}
