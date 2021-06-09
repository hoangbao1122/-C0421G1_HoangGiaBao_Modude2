package _06_ke_thua.baitap.hinhtron_hinhtru;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
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
    public double getArea(){
        double Area;
        return Area = Math.pow(this.radius,2) * Math.PI;
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
