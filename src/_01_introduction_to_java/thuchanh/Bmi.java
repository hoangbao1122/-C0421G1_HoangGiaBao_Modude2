import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Weight");
        float weight = scanner.nextFloat();
        System.out.println("enter Height");
        float height = scanner.nextFloat();
        float bmi = weight / (height * height);
        System.out.println(bmi);
        if (bmi<18.5){
            System.out.println("UnderWeight");
        }else if(bmi<25){
            System.out.println("normal");
        }else if(bmi<30){
            System.out.println("OverWeight");
        }else {
            System.out.println("obese");
        }
    }
}

