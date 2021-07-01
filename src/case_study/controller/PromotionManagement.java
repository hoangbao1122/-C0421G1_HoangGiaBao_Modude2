package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    public static void PromotionManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = Display list customers use service ");
        System.out.println("2 = Display list customers get voucher ");
        System.out.println("3 = Return main menu ");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                System.out.println("Display list customers use service");
                break;
            }
            case 2:{
                System.out.println("Display list customers get voucher");
                break;
            }
            case 3:{
                System.out.println("Return main men");
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
