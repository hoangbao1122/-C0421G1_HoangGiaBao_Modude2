package _02_vong_lap.baitap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int countPrime = 0;
        int run = 1;
        while (true){
            int cout = 0;
            int i = 1;
            for (i = 1;i<=run;i++){
                if (run%i==0){
                    cout++;
                }
            }
            if (cout == 2){
                System.out.println(run);
                countPrime++;
            }
            if (countPrime ==20){
                break;
            }
            run++;
        }
    }
}
