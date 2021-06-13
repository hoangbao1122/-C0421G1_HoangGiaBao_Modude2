package _06_ke_thua.thuchanh.hinhhoc;

import _07_abstract_classva_interface.baitap.Resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;
    private double resize;
    public Rectangle(){

    }
    public Rectangle(double side, double v) {

    }

    public Rectangle(double resize) {
        this.resize = resize;
    }

    public double getResize() {
        return resize;
    }

    public void setResize(double resize) {
        this.resize = resize;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", tăng size" + getWidth() +
                ", tăng size" + getHeight() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + getResize());
        setHeight(getHeight() + getResize());
    }
}
