package _19_StringRegex.thuchanh;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNameAccount {
        private static  final String AccountName = "^[_a-z0-9]{6,}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên tài khoản");
        String inputString = scanner.next();
        boolean pattern = Pattern.matches(AccountName,inputString);
        while (!pattern){
            System.out.println("bạn đã nhập sai vui lòng nhập lại");
            inputString = scanner.next();
            pattern = Pattern.matches(AccountName,inputString);
        }
        System.out.println("bạn đã nhập đúng");
    }
}
