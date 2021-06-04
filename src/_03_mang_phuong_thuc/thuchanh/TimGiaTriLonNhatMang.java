package _03_.thuchanh;

import java.util.Scanner;

public class TimGiaTriLonNhatMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array;
        int inputSize;

        do{
            System.out.println("nhập vào độ dài của mảng");
             inputSize = scanner.nextInt();
            if (inputSize>20){
                System.out.println("quá giới hạn phần tử của mảng");
                break;
            }
        }while (inputSize > 20);
        array = new int[inputSize];
        int i = 0;
        while(i<array.length){
            System.out.println("Vị trí phần tử "+ (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        int max = 0;
        int index = 0;
        for (int j = 0;j<array.length;j++){
            if (array[j]>max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Số lớn nhất của mảng "+max + " vị trị số lớn nhất  " + index);
    }
}
