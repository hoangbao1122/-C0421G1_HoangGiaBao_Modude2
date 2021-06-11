package _07_abstract_classva_interface.thuchanh.SoSanhHinhHoc;

import _05_access_modifier_static_method_static_property.baitap.Circle.Cricle;
import _06_ke_thua.baitap.hinhtron_hinhtru.Circle;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Cricle[] cricles = new Cricle[3];
        cricles[0] = new Cricle(3.5,"blue");
        cricles[1] = new Cricle();
        cricles[2] = new Cricle(3.5,"red",false);

        for (Cricle cricle:cricles){
            System.out.println(cricle);
        }
    }
}
