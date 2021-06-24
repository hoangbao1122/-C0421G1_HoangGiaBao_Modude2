package _14_thuat_toan_sap_xep.thuchanh;

public class Noibot {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        NoiBot(array);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void NoiBot(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }
}
