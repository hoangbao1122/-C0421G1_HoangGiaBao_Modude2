package case_study.controller;

import case_study.serivce.CusAndEmp.EmployeeServiceImpl;

import java.util.Scanner;

public  class EmployeeManagement {
    private  static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static void EmployeeManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = display ");
        System.out.println("2 = add ");
        System.out.println("3 = edit ");
        System.out.println("4 = tro ve ");
        int input = scanner.nextInt();
        boolean check = true;
        switch (input){
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
