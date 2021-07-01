package _19_StringRegex.baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private  static final String NameClass_Regex = "^[CAP]\\d{4}[GHIKLM]$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên class");
        String inputNameClass = scanner.next();
        boolean pather = Pattern.matches(NameClass_Regex,inputNameClass);
        while (!pather){
            System.out.println("bn nhập sai hãy nhập lại");
            inputNameClass = scanner.next();
            pather = Pattern.matches(NameClass_Regex,inputNameClass);

        }
        System.out.println("bạn đã nhập đúng");
    }

}
