package _14_thuat_toan_sap_xep.thuchanh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Chon {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Chon(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Chon(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i]; // min = 9
            int minIndex = i; // minIndex = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
