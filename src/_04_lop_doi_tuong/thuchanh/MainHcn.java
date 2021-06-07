package _04_lop_doi_tuong.thuchanh;

import java.util.Scanner;

public class MainHcn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều rộng");
        double width = scanner.nextDouble();
        System.out.println("nhập vào chiều dài");
        double height = scanner.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(width,height);
        hinhChuNhat.showAll();

    }
}
