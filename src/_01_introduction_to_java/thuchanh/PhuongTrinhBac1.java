import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("a =");
        a = scanner.nextFloat();
        System.out.println("b =");
        b = scanner.nextFloat();
        System.out.println("c = ");
        c = scanner.nextFloat();

        if (a !=0){
            double answer = (c-b)/a;
            System.out.println("kết quả" + answer);
        }else{
            if (b==0) {
                System.out.println("The solution is al x!");
            }else{
                System.out.println("No solution");
            }
        }

    }
}
