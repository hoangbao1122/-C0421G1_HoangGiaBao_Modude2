package _06_ke_thua.thuchanh.hinhhoc;

import _07_abstract_classva_interface.baitap.Colorable.Colorable;

public class Square extends Rectangle implements Colorable {

    public Square(){

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();

    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
