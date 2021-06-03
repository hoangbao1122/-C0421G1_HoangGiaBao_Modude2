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
        for (int x = 0;x<7;x++){        //bai2
            for (int y =0;y<=x;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");         // bai3
        for (int a = 7;a>=1;a--){
            for (int b = 0;b<a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
