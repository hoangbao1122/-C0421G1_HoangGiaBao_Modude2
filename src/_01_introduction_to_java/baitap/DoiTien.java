package baitap;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Usd");
        double usd = scanner.nextFloat();
        double vnd = usd * 23000;
        System.out.println(usd+"$ = " + vnd +  " VND");
    }
}
