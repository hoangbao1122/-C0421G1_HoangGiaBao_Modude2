package _02_vong_lap.thuchanh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("4. Exit");
        int input = scanner.nextInt();
        switch (input) {
            case 1: {
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            }
            case 2: {
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            }
            case 3: {
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
            default:{
                System.out.println("sai");
                break;
            }
        }

    }

}
