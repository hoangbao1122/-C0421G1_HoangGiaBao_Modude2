package _06_ke_thua.baitap.hinhtron_hinhtru;

import _05_access_modifier_static_method_static_property.baitap.Circle.Cricle;
import _07_abstract_classva_interface.baitap.Resizeable.Resizeable;

public class Circle implements Resizeable {
    private double radius;
    private String color;
    private boolean filler;
    private double percent = 0;


    public Circle() {

    }

    public Circle(double percent) {
        this.percent = percent;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean filler) {
        this.radius = radius;
        this.color = color;
        this.filler = filler;
    }

    public Circle(double radius, String color, boolean filler, double percent) {
        this.radius = radius;
        this.color = color;
        this.filler = filler;
        this.percent = percent;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getArea() {
        double Area;
        return Area = Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + percent);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " color='" + color + '\'' +
                " dien tich=" + getArea() +
                '}';
    }


}
