

import sun.security.util.Length;

import java.util.Scanner;

public class doc_so_thanh_chu {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        int hangTram = number / 100;
        int hangChuc = (number - hangTram *100)/10;
        int hangDonVi = (number - hangTram *100-hangChuc*10);

        dacBiet(number);
        chuyenHangTram(hangTram);
        chuyenHangChuc(hangChuc);
        chuyenHangDonVi(hangDonVi);

    }
    public static void dacBiet(int number){
        switch (number) {
            case 11: {
                System.out.println("elevent");
                break;
            }
            case 12: {
                System.out.println("twelve");
                break;
            }
            case 13: {
                System.out.println("thirteen");
                break;
            }
            case 14: {
                System.out.println("fourteen");
                break;
            }
            case 15: {
                System.out.println("fiveteen");
                break;
            }
            case 16:{
                System.out.println("sixteen");
                break;
            }
            case 17:{
                System.out.println("seventeen");
                break;
            }
            case 18:{
                System.out.println("eighteen");
                break;
            }
            case 19:{
                System.out.println("niceteen");
                break;
            }
        }
    }
    public static void chuyenHangDonVi(int hangDonVi){
        switch (hangDonVi){
            case 1:{
                System.out.println("one");
                break;
            }
            case 2:{
                System.out.println("two");
                break;
            }
            case 3:{
                System.out.println("three");
                break;
            }case 4:{
                System.out.println("four");
                break;
            }
            case 5:{
                System.out.println("five");
                break;
            }
            case 6:{
                System.out.println("six");
                break;
            }
            case 7:{
                System.out.println("sevent");
                break;
            }
            case 8:{
                System.out.println("eight");
                break;
            }
            case 9:{
                System.out.println("nice");
                break;
            }

        }
    }
    public  static void chuyenHangChuc(int hangChuc){
        switch (hangChuc){
            case 1:{
                System.out.println("ten");
                break;
            }
            case 2:{
                System.out.println("twety");
                break;
            }
            case 3:{
                System.out.println("thirty");
                break;
            }
            case 4:{
                System.out.println("fourty");
                break;
            }
            case 5:{
                System.out.println("fivety");
                break;
            }
            case 6:{
                System.out.println("sixty");
                break;
            }
            case 7:{
                System.out.println("seventy");
                break;
            }
            case 8:{
                System.out.println("eightty");
                break;
            }
            case 9:{
                System.out.println("nicety");
                break;
            }
        }
    }
    public static void chuyenHangTram(int hangTram){
        switch (hangTram){
            case 1:{
                System.out.println("one hundred");
                break;
            }
            case 2:{
                System.out.println("two hundred");
                break;
            }
            case 3:{
                System.out.println("three hundred");
                break;
            }
            case 4:{
                System.out.println("four hundred");
                break;
            }
            case 5:{
                System.out.println("five hundred");
                break;
            }
            case 6:{
                System.out.println("six hundred");
                break;
            }
            case 7:{
                System.out.println("seven hundred");
                break;
            }
            case 8:{
                System.out.println("eight hundred");
                break;
            }
            case 9:{
                System.out.println("nice hundred");
                break;
            }
        }
    }




}

