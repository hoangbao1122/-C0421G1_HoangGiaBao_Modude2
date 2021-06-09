package _06_ke_thua.thuchanh.hinhhoc;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double GetArea(){
        double area;
        return area = radius *radius * Math.PI;
    }
    public double getPerimeter(){
        double perimeter;
        return perimeter = 2* radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
