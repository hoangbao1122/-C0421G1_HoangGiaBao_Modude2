package _06_ke_thua.baitap.hinhtron_hinhtru;

import _05_access_modifier_static_method_static_property.baitap.Circle.Cricle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setColor("red");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(1,"red",20);
        System.out.println(cylinder.toString());
    }
}
