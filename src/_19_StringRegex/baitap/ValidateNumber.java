package _19_StringRegex.baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNumber {
    private static final String Phone_Regex =  "^84[-][0]\\d{9}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào number phone ");
        String inputPhone = scanner.next();

        boolean pattern = Pattern.matches(Phone_Regex,inputPhone);
        while (!pattern){
            System.out.println("vui lòng nhập lại number phone ");
            inputPhone = scanner.next();
            pattern = Pattern.matches(Phone_Regex,inputPhone);
        }
        System.out.println("phone number bn nhập chính sác");

    }
}
