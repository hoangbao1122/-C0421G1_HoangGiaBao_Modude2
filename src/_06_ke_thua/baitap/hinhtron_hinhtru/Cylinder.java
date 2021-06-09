package _06_ke_thua.baitap.hinhtron_hinhtru;

public class Cylinder extends Circle {
    private double chieuCao;

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public Cylinder(){

    }

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }
    public double theTichHinhTru(){
        double theTich;
       return theTich = chieuCao * Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " chieuCao=" + chieuCao +
                " radius=" + getRadius() +
                " color =" + getColor() +
                " the tich=" + theTichHinhTru() +
                '}';
    }
}
