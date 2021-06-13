package _05_access_modifier_static_method_static_property.baitap.Circle;

public  class Cricle {
    private  boolean filler;
    private double radius = 1.0;
    private String color = "red";
    public Cricle(){

    }
    public Cricle(double radius , String color){
        this.radius = radius;
        this.color = color;
    }
    public Cricle(double radius , String color,boolean filler){
        this.radius = radius;
        this.color = color;
        this.filler = filler;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public double getArea(){
        double Area;
        return Area = Math.pow(this.radius,2) * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }


}
