package _07_abstract_classva_interface.baitap.Colorable;

import _06_ke_thua.thuchanh.hinhhoc.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(20);
        System.out.println(square.toString());
        if (square.getSide()>0){
            square.howToColor();
        }
    }
}
