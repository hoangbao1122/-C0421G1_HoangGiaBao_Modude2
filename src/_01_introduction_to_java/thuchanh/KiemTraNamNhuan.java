import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Year");
        int yearInput = scanner.nextInt();
        if(yearInput % 4 ==0 && yearInput % 100 != 0){
            System.out.println(yearInput + " is a leap year");
        }else if(yearInput % 100 ==0 && yearInput % 400 == 0){
            System.out.println(yearInput + " is a leap year");
        }else {
            System.out.println(yearInput + " not leap year");
        }
    }
}
