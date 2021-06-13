package demoAnhTrung;

import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("chương trình quản lí sinh viên");
        Student[] student = new Student[5];
        while (true) {
            System.out.println("Menu chương trình");
            System.out.println("1:Xem danh sách sinh viên");
            System.out.println("2 Thêm sinh viên");
            System.out.println("3 Sưa thông tin sinh viên");
            System.out.println("4 Xóa thông tin sinh viên");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    displayStudent(student);
                    break;
                }
                case 2: {
                    addStudent(student);
                    break;
                }
//                case 3: {
//                    updateStudent(student);
//                    break;
//
//                }
                case 4:{
                    deleteStudent(student);
                    break;
                }
                default:{
                    System.out.println("mã số bạn nhập ko đúng vui lòng nhập lại");
                    break;
                }
            }
        }
    }

    public static void displayStudent(Student[] student) {
        int i;
        for (i = 0; i < student.length; i++) {

            if (student[i] != null) {
                System.out.println("Số thứ tự " + (i + 1) + ": " + student[i]);
            }
        }
    }

    public static void addStudent(Student[] student) {

        System.out.println("nhập id sinh viên muốn thêm");
        int id = scanner.nextInt();

        System.out.println("nhập vào tên sv");
        String name = scanner.next();

        System.out.println("nhập vào tuôi sv");
        int age = scanner.nextInt();

        System.out.println("nhập vào địa chỉ");
        String address = scanner.nextLine();

        Student newStudent = new Student(id,name,age,address);
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                student[i] = newStudent;
                break;
            }
        }
    }
    public static void deleteStudent(Student[] student){
        System.out.println("nhập tên sinh viên muốn xóa");
        String detele = scanner.nextLine();
        int i;
        for (i=0;i<student.length;i++){
            if (detele.equals(student[i])){
                student[i] = null;
            }
        }
    }
//    public static void updateStudent(Student[] student){
//        System.out.println("nhập tên sinh viên muốn sửa");
//        String update = scanner.nextLine();
//        int i;
//        boolean check = false;
//        for (i=0;i<student.length;i++){
//            if (update.equals(student[i])){
//                check = true;
//                System.out.println("cập nhập thông tin mới");
//                String updateNow = scanner.nextLine();
//                student[i] = updateNow;
//            }
//        }if (check = false){
//            System.out.println("Tên Sv bạn nhập ko đug");
//        }
//    }
}
