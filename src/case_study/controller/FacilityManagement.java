package case_study.controller;

import case_study.serivce.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {
    public static void FacilityManagement(){
        Scanner scanner = new Scanner(System.in);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1 = display ");
        System.out.println("2 = add ");
        System.out.println("3 = hiển thị dịch vụ cần bảo trì");
        System.out.println("4 = tro ve ");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                facilityService.display();
                break;
            }
            case 2:{
                facilityService.add();
                break;
            }
            case 3:{
                facilityService.maintenanceDisplay();
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
