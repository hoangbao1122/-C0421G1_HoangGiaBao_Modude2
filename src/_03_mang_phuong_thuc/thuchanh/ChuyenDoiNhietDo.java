package _03_.thuchanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn 1 từ C sang F");
        System.out.println("chọn 2 từ f sang c");
        int input = scanner.nextInt();
        double inputC;
        double inputF;
        switch (input){
            case 1:{
                System.out.println("nhập vào C");
                inputC = scanner.nextDouble();
                System.out.println(cSangf(inputC));
                break;
            }
            case 2:{
                System.out.println("nhập vào f");
                inputF = scanner.nextDouble();
                System.out.println(fSangC(inputF));
                break;
            }
            default:{
                System.out.println("thoát");
            }
        }
    }
    public static double  cSangf(double inputC){
        double inputF = (9.0 / 5) * inputC + 32;
        return inputF;
    }
    public static double fSangC(double inputF){
        double inputC =  (5.0 / 9) * (inputF - 32);
        return inputC;
    }
}
