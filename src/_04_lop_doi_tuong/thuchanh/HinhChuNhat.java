package _04_lop_doi_tuong.thuchanh;

import java.awt.*;

public class HinhChuNhat {
    double width;
    double height;


    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double chuVi() {
        return (width + height) * 2;
    }

    public double dienTich() {
        return width * height;
    }

    public void showAll() {
        System.out.println("Chu vi hình chữ nhật = " + this.chuVi());
        System.out.println("Diện tích hình chữ nhật = " + this.dienTich());
    }
}
