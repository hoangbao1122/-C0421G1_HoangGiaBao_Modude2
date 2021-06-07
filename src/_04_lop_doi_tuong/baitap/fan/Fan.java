package _04_lop_doi_tuong.baitap.fan;

public class Fan {
    int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private boolean on = true;

    private double radius = 5;



    private String color = "blue";

    public int speed() {
        return this.SLOW;
    }
    public int setSpeed( int newSpeed){
        return this.SLOW = newSpeed;
    }

    public boolean getOn() {
        return this.on;
    }

    public boolean getOff() {
       return this.on = false;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double newRadius){

         this.radius = newRadius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

    @Override
    public String toString() {  // on
        return "Fan{" +
                "on=" + on +
                ",Speed=" + SLOW +
                ", radius=" + radius +

                ", color='" + color +
                ", fan is on" + '\'' +
                '}';
    }

    public String toStringFalse() {  // off
        return "Fan{" +
                "on=" + getOff() +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", fan is off" +
                '}';
    }

}
