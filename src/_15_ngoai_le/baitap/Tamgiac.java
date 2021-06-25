package _15_ngoai_le.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tamgiac {
    public static void main(String[] args) {
        try {
             Tamgiac();
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

    }
    private static void Tamgiac() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập vào cạnh 1 ");
        int canh1 = scanner.nextInt();
        if (canh1 < 0) throw new InputMismatchException(" không được nhỏ hơn 0.");

        System.out.println("nhập vào cạnh 2");
        int canh2 = scanner.nextInt();
        if (canh2 < 0) throw new InputMismatchException(" không được nhỏ hơn 0.");

        System.out.println("nhập vào cạnh 3");
        int canh3 = scanner.nextInt();
        if (canh3 < 0) throw new InputMismatchException(" không được nhỏ hơn 0.");

        if (canh1 + canh2 <= canh3 || canh2 + canh3 <= canh1 || canh1 + canh3 <= canh2 ){
            throw new InputMismatchException("sai");
        }else {
            System.out.println("đúng");
        }
    }
}
