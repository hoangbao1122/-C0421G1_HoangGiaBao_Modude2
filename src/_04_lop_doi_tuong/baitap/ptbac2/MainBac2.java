package _04_lop_doi_tuong.baitap.ptbac2;

import java.util.Scanner;

public class MainBac2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào a");
     double a = scanner.nextDouble();
        System.out.println("nhập vào b");
        double b  = scanner.nextDouble();
        System.out.println("nhập vào c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()>=0){
            System.out.println("Nghiệm 1 " + quadraticEquation.roo1());
            System.out.println("Nghiêm 2 " + quadraticEquation.root2());
        }else {
            System.out.println("pt có 2 nghiệm = 0 ");
        }


    }
}
