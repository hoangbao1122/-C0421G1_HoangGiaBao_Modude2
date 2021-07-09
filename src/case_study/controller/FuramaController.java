package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    static int choice(){
        boolean check = false;
        int choice = 0;
        while (!check){
            try {
                System.out.println("nhập vào chức năng muốn chọn");
                choice = Integer.parseInt(scanner.next());
                check = true;
            }catch (NumberFormatException e){
                System.out.println("nhập số giùm");
            }
        }
        return choice;
    }
    public static void displayMainMenu(){

        System.out.println("choose 1 = Employee Management");
        System.out.println("choose 2 = Customer Management");
        System.out.println("choose 3 = Facility Management");
        System.out.println("choose 4 = Booking Management");
        System.out.println("choose 5 = Promotion Management");
        System.out.println("choose 6 = exit");
        while (true){
            switch (choice()){
                case 1:{
                    System.out.println("Employee Management");
                    EmployeeManagement.EmployeeManagement();
                    break;
                }
                case 2:{
                    System.out.println("Customer Management");
                    CustomerManagement.CustomerManagement();
                    break;
                }
                case 3:{
                    System.out.println("Facility Management ");
                    FacilityManagement.FacilityManagement();
                    break;
                }
                case 4:{
                    System.out.println("Booking Managerment");
                    BookingManagerment.BookingManagerment();
                    break;
                }
                case 5:{
                    System.out.println("Promotion Management");
                    PromotionManagement.PromotionManagement();
                    break;
                }
                case 6:{
                    System.exit(1);
                    break;
                }
                default:{
                    System.out.println("error");
                    break;
                }
            }
        }
    }
}
