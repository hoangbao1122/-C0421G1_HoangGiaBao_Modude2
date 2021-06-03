import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào width");
        width = scanner.nextFloat();
        System.out.println("nhập vào height");
        height = scanner.nextFloat();
        float s = width * height;
        System.out.println("Diện tích" + s);
    }
}
