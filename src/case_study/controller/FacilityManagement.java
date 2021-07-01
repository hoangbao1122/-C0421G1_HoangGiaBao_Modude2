package case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    public static void FacilityManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = display ");
        System.out.println("2 = add ");
        System.out.println("3 = edit ");
        System.out.println("4 = tro ve ");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                System.out.println("display");
                break;
            }
            case 2:{
                System.out.println("Add");
                break;
            }
            case 3:{
                System.out.println("edit");
                break;
            }
            case 4:{
                System.out.println("tra ve cai chon ban dau");
                FuramaController.displayMainMenu();
            }
            default:{
                System.out.println("bn nhap sai");
                break;
            }
        }
    }
}
