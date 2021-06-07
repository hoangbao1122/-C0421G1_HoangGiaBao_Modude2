package _04_lop_doi_tuong.baitap.ptbac2;

import java.util.Date;

public class QuadraticEquation {
    double a;
    double b;
    double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b,2) - 4 *a*c;
        return delta;
    }
    public double roo1(){
        double r1;
        r1 = (-b+Math.sqrt(getDiscriminant())) / (2*a);
        return r1;
    }
    public double root2(){
        double r2;
        r2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        return r2;
    }

}
