package _06_ke_thua.baitap._2d_3d;

public class Main {
    public static void main(String[] args) {
        HaiD haiD = new HaiD();
        haiD.setXY(10,20);
        System.out.println(haiD.toString());

        BaD baD = new BaD();
        baD.setXYZ(4,2,3);
        System.out.println(baD.toString());
    }
}
