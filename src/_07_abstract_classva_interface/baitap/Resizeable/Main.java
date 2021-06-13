package _07_abstract_classva_interface.baitap.Resizeable;


import _05_access_modifier_static_method_static_property.baitap.Circle.Cricle;
import _06_ke_thua.baitap.hinhtron_hinhtru.Circle;
import _06_ke_thua.thuchanh.hinhhoc.Rectangle;
import _06_ke_thua.thuchanh.hinhhoc.Shape;
import _06_ke_thua.thuchanh.hinhhoc.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20,"Red",false);
        System.out.println(circle.toString());
        System.out.println("");
        circle.resize(40);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("red",false,20,40);
        System.out.println(rectangle.toString());
        System.out.println("");
        rectangle.resize(10);
        System.out.println(rectangle.toString());
        System.out.println("");

        Square square = new Square("red",false,100);
        System.out.println(square.toString());
        System.out.println("");
        square.resize(20);
        System.out.println(square.toString());





    }
}
