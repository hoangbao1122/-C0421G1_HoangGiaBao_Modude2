package _03_.baitap;

import java.util.Scanner;

public class Them {
    public static void main(String[] args) {
      int[] array = {10,9,8,1,7,6,100,70};
      Scanner scanner = new Scanner(System.in);
      System.out.println("vị trí phần tử trong mảng");
      int index =scanner.nextInt();
      int themPhanTu;
      int i;
      boolean check = false;
      for (i=0;i<array.length;i++){
          if (index == i){
              check = true;
              System.out.println("nhập vào số muốn chèn");
           themPhanTu = scanner.nextInt();
             array[i] = themPhanTu;
         }
      }if (check == false){
            System.out.println("số bạn nhập quá giới hạn của mảng");
        }
      for (int j = 0;j<array.length;j++){
          System.out.print(array[j]+" ");
      }
    }
}



