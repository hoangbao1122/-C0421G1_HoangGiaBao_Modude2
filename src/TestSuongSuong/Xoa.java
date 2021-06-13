package TestSuongSuong;

import java.util.Scanner;

public class Xoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {6,7,9,14,55};
        System.out.println("nhap vao gia tri");
        int input = scanner.nextInt();
        for (int i = 0;i<array.length;i++){
            if (input == array[i]){
                for (int j = 0;j<array.length-1;j++){
                    array[j] = array[j+1];
                    array[j+1] = 0;
                }
            }
            System.out.print(array[i] + " ");
        }

    }
}
