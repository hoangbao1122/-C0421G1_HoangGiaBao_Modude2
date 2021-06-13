package _07_abstract_classva_interface.thuchanh.hinhhoc;

import _05_access_modifier_static_method_static_property.baitap.Circle.Cricle;
import _06_ke_thua.baitap.hinhtron_hinhtru.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {

    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    public ComparableCircle(double radius, String color, boolean filler) {
        super(radius, color, filler);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if (super.getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
