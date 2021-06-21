package _11_Stack_Queue.option.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số lớn hơn 0");
        int input = scanner.nextInt();
        String nhiPhan = "";
        while (input > 0){
            nhiPhan = (input % 2) + nhiPhan;
            input = input / 2;
        }
        System.out.println(nhiPhan);
        }

    }
