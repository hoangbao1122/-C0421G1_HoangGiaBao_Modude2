package _06_ke_thua.thuchanh.hinhhoc;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        Rectangle rectangle = new Rectangle("red", true, 1.5, 2);
        System.out.println(rectangle);

        Square square = new Square("red",true,2);
        System.out.println(square);

    }
}
