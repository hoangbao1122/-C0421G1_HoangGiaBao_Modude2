package _03_.baitap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[]array = {20,2,3,4,5};
        int min = 10;
        for (int i =0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
