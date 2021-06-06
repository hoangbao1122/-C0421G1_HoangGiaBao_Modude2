package _03_.baitap;

import java.util.Scanner;

public class Xoa {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào giá trị phần tử cần xóa  cần xóa");
        int delteElement = scanner.nextInt();
        for (int i =0;i<array.length;i++) {
            if (delteElement == array[i]) {
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
