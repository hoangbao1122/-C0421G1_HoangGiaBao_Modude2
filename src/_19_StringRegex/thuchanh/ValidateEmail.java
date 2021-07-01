package _19_StringRegex.thuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static final String Email_Regex =  "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào email");
        String inputEmail = scanner.next();

        boolean pattern = Pattern.matches(Email_Regex,inputEmail);
        while (!pattern){
            System.out.println("vui lòng nhập lại email");
            inputEmail = scanner.next();
            pattern = Pattern.matches(Email_Regex,inputEmail);
        }
        System.out.println("email bn nhập chính sác");

    }

}
