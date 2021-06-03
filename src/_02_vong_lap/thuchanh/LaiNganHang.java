package _02_vong_lap.thuchanh;

import java.util.Scanner;

public class LaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số tiền bạn muốn gửu");
        int monney = scanner.nextInt();
        System.out.println("nhập vào số tháng");
        int month  = scanner.nextInt();
        System.out.println("lãi xuất");
        float laiXuat = scanner.nextFloat();
        int totalMoney = 0;
        for (int i = 0 ;i<month;i++){
            totalMoney += monney * (laiXuat/100)/12*month;
        }
        System.out.println(totalMoney);
    }
}
