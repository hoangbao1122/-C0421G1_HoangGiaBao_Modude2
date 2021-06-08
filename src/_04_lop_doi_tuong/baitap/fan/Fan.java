package _04_lop_doi_tuong.baitap.fan;

public class Fan {
    int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = true;
    private int koHoatDong = 4;
    private double radius = 5;


    private String color = "blue";

    public int speed() {
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String displaySpeed(){
        if (this.speed==SLOW){
            return "slow";
        }else if(this.speed == MEDIUM){
            return "medium";
        }else if(this.speed == FAST){
            return "fast";
        }else if (this.speed == koHoatDong){
            return "ko chạy";
        }else {
            return "lỗi";
        }
    }

    public boolean getOn() {
        return this.on;
    }

    public boolean getOff() {
        this.on = false;
        this.setSpeed(4);
        return false;
    }

    public double radius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {

        this.radius = newRadius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
    public String thongBao(){
        String alert;
        if (this.getOn()){
           return alert =  "fan is on";
        }else{
           return alert =  "fan is off";
        }
    }

    @Override
    public String toString() {

        return "Fan{" +
                "on=" + on +
                ",Speed=" + this.displaySpeed() +
                ", radius=" + radius +

                ", color='" + color +
                ", fan is on" + '\'' +
                ", trạng thái " + this.thongBao() +
                '}';

    }


  
}
