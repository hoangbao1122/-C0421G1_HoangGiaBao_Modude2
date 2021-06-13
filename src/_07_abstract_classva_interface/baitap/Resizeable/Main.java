package _07_abstract_classva_interface.baitap.Resizeable;


import _06_ke_thua.baitap.hinhtron_hinhtru.Circle;
import _06_ke_thua.thuchanh.hinhhoc.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20,"Red",false);
        System.out.println(circle.toString());
        circle.resize(40);
        System.out.println(circle.toString());



        Rectangle rectangle = new Rectangle("red",false,20,40);
        rectangle.resize(10);
        System.out.println(rectangle.toString());
    }
}
