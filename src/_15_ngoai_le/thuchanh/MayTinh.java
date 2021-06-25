package _15_ngoai_le.thuchanh;

import java.util.Scanner;

public class MayTinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào x");
        int inputX = scanner.nextInt();
        System.out.println("nhập vào y");
        int inputY = scanner.nextInt();
        mayTinh(inputX,inputY);
    }
    public static void mayTinh(int x,int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tổng = " + a);
            System.out.println("hiệu = " + b);
            System.out.println("tích = " + c);
            System.out.println("thương = " + d);
        }catch (Exception e){
            System.out.println("xảy ra ngoại lệ" + e.getMessage());
        }
    }
}
