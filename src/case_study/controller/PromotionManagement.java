package case_study.controller;

import case_study.serivce.PromotionServicceImpl;
import case_study.serivce.interface_all.PromotionServicce;

import java.util.Scanner;

import static case_study.controller.FuramaController.choice;

public class PromotionManagement {
    public static void PromotionManagement(){
        Scanner scanner = new Scanner(System.in);
        PromotionServicceImpl promotionServicce = new PromotionServicceImpl();
        System.out.println("1 = Display list customers use service ");
        System.out.println("2 = Display list customers get voucher ");
        System.out.println("3 = Return main menu ");
        switch (choice()){
            case 1:{
                System.out.println("Display list customers use service");
                promotionServicce.display();
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
