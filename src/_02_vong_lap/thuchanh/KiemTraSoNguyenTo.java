package _02_vong_lap.thuchanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("check Số nguyên tố");
        int input = scanner.nextInt();

        if(input<2){
            System.out.println("không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i<= Math.sqrt(input)){
                if (input % i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(input+" số nguyên tố");
            }else {
                System.out.println(input+" ko phải số nguyên tố");
            }
        }
    }

}
