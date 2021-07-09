package case_study.controller;

import case_study.serivce.bookingAndContact.BookingServiceImpl;
import case_study.serivce.bookingAndContact.ContactServiceImpl;

import java.util.Scanner;

import static case_study.controller.FuramaController.choice;

public class BookingManagerment {
    public static void BookingManagerment(){
        Scanner scanner = new Scanner(System.in);
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContactServiceImpl contactService = new ContactServiceImpl();
        System.out.println("1 = display Booking");
        System.out.println("2 = add Booking ");
        System.out.println("3 = Create new constracts ");
        System.out.println("4 = edit contact ");
        System.out.println("5 = hiển thị hợp đồng ");
        System.out.println("6 = return menu");
        switch (choice()){
            case 1:{
                bookingService.display();
                break;
            }
            case 2:{
                bookingService.add();
                break;
            }
            case 3:{
                contactService.add();
                break;
            }
            case 4:{
                contactService.edit();
                break;
            }
            case 5:{
                contactService.display();
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
