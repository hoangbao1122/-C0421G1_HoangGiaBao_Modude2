package demoAnhTrung;

import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("chương trình quản lí sinh viên");
        String[] student = new String[5];
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
                case 3: {
                    updateStudent(student);
                    break;

                }
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

    public static void displayStudent(String[] student) {
        int i;
        for (i = 0; i < student.length; i++) {

            if (student[i] != null) {
                System.out.println("Số thứ tự " + (i + 1) + ": " + student[i]);
            }
        }
    }

    public static void addStudent(String[] student) {
        System.out.println("Nhập vào tên sinh viên muốn thêm");
        String studentNew = scanner.nextLine();

        int i;
        for (i = 0; i < student.length; i++) {
            if (student[i] == null) {
                student[i] = studentNew;
                break;
            }
        }
    }
    public static void deleteStudent(String[] student){
        System.out.println("nhập tên sinh viên muốn xóa");
        String detele = scanner.nextLine();
        int i;
        for (i=0;i<student.length;i++){
            if (detele.equals(student[i])){
                student[i] = null;
            }
        }
    }
    public static void updateStudent(String[] student){
        System.out.println("nhập tên sinh viên muốn sửa");
        String update = scanner.nextLine();
        int i;
        boolean check = false;
        for (i=0;i<student.length;i++){
            if (update.equals(student[i])){
                check = true;
                System.out.println("cập nhập thông tin mới");
                String updateNow = scanner.nextLine();
                student[i] =updateNow;
            }
        }if (check = false){
            System.out.println("Tên Sv bạn nhập ko đug");
        }
    }
}
