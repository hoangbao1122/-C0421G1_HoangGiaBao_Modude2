package case_study.controller;

import case_study.serivce.booking.BookingServiceImpl;

import java.util.Scanner;

public class BookingManagerment {
    public static void BookingManagerment(){
        Scanner scanner = new Scanner(System.in);
        BookingServiceImpl bookingService = new BookingServiceImpl();
        System.out.println("1 = display ");
        System.out.println("2 = add ");
        System.out.println("3 = Create new constracts ");
        System.out.println("4 = edit ");
        System.out.println("5 = trả về list danhsach");
        System.out.println("6 = return menu");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                bookingService.display();
                break;
            }
            case 2:{
                bookingService.add();
                break;
            }
            case 3:{
                System.out.println("Create new constracts");
                break;
            }
            case 4:{
                System.out.println("edit");
                break;
            }
            case 5:{
                System.out.println("trả về list danhsach");
                break;
            }
            case 6:{
                System.out.println("tra ve cai chon ban dau");
                FuramaController.displayMainMenu();
                break;
            }
            default:{
                System.out.println("bn nhap sai");
                break;
            }
        }
    }
}
