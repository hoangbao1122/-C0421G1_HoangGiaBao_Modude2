package _06_ke_thua.thuchanh.hinhhoc;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double side, double v){

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
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2 ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
