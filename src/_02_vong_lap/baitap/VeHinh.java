package _02_vong_lap.baitap;

public class VeHinh {
    public static void main(String[] args) {
        for (int i =0;i<3;i++){   // bai1
            for (int j= 0;j<10;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int x = 0;x<=5;x++){        //bai2
            for (int y =0;y<x;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");         // bai3
        for (int a = 7;a>=1;a--){
            for (int b = 1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        int m = 5, n = 5;
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 2 * 5 - 1; j++){
                if (j >= m && j <= n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            m--;
            n++;
            System.out.print("\n");
        }
    }
}
