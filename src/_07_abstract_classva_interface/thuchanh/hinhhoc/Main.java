package _07_abstract_classva_interface.thuchanh.hinhhoc;

import _06_ke_thua.baitap.hinhtron_hinhtru.Circle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6,"red");
        circles[1] = new ComparableCircle();// ra mac dinh
        circles[2] = new ComparableCircle(3.2,"yellow",false);

        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }

        Arrays.sort(circles); // sắp xếp
        System.out.println("sau khi sắp sếp");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
    }
}
