package case_study.controller;

import case_study.serivce.CusAndEmp.EmployeeServiceImpl;

import java.util.Scanner;

import static case_study.controller.FuramaController.choice;

public  class EmployeeManagement {
    private  static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static void EmployeeManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = display Employ");
        System.out.println("2 = add Employ ");
        System.out.println("3 = edit Employ ");
        System.out.println("4 = tro ve ");

        switch (choice()){
            case 1:{
                employeeService.display();
                break;
            }
            case 2:{
                employeeService.add();
                break;
            }
            case 3:{
                employeeService.edit();
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
