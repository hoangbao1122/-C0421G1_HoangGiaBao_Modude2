package _03_.thuchanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] array = {"hoang","gia","bao"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên bạn muốn tìm kiếm");
        String input = scanner.next();
        boolean check = false;
        for (int i =0 ;i<array.length;i++){
           if (array[i].equals(input)){
               check = true;
               System.out.println(i+1);
           }
           }
        if(!check){
            System.out.println("ko có trong mảng");
        }
        }

    }

