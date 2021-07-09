package case_study.controller;

import case_study.serivce.CusAndEmp.CustomerServiceImpl;

import java.util.Scanner;

import static case_study.controller.FuramaController.choice;

public class CustomerManagement {
    public static void CustomerManagement(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = display Cus ");
        System.out.println("2 = add Cus");
        System.out.println("3 = edit Cus");
        System.out.println("4 = tro ve ");

        switch (choice()){
            case 1:{
                customerService.display();
                break;
            }
            case 2:{
                customerService.add();
                break;
            }
            case 3:{
                customerService.edit();
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
