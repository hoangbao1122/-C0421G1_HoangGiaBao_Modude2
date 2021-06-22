package _12_java_collection_framework.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> manager = new LinkedList<>();
        while (true) {
            System.out.println("Menu chương trình");
            System.out.println("1:Hiển thị sản phẩm");
            System.out.println("2 Thêm Sản phẩm");
            System.out.println("3 Sưa thông tin sản phẩm");
            System.out.println("4 Xóa thông tin sản phẩm");
            System.out.println("5 Tìm kiếm theo index sản phẩm");
            System.out.println("6 Sắp xếp sản phẩm");

            String money;
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    display(manager);
                    break;
                }
                case 2: {
                    add(manager);
                    break;
                }
                case 3: {
                    Sua(manager);
                    break;
                }
                case 4: {
                    remove(manager);
                    break;
                }
                case 5:{
                    search(manager);
                }
                case 6:{
                    break;
                }
                default: {
                    System.out.println("mã số bạn nhập ko đúng vui lòng nhập lại");
                    break;
                }
            }
        }
    }

    public static void add(LinkedList<String> manager){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào id sản phẩm");
        int idSanpham = scanner.nextInt();
        System.out.println("nhập vào name sản phẩm");
        String nameSanpham = scanner.next();
        System.out.println("nhập vào giá tiền");
        int money = scanner.nextInt();

        Product newSamPham = new Product(idSanpham,nameSanpham,money);
        manager.add(String.valueOf(newSamPham));
    }
    public static void display(LinkedList<String> manager){
       for (int i = 0 ;i<manager.size();i++){
           System.out.println(manager.get(i));
       }
    }
    public static void remove(LinkedList<String> manager ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào vị trí index muốn xóa");
        int inputXoa = scanner.nextInt();
        for (int i = 0;i<manager.size();i++){
            if (inputXoa == i){
                manager.remove(i);
                break;
            }
        }
    }
    public static void Sua(LinkedList<String> manager){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào index muốn sửa");
        int inputSua = scanner.nextInt();
        for (int i =0;i<manager.size();i++){
            if (inputSua == i){
                manager.remove(i);
                 add(manager);
            }
        }
    }
    public static void search(LinkedList<String> manager){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào index  sản phẩm");
        int input = scanner.nextInt();
        for (int i = 0;i<manager.size();i++){
            if (input == i){
                System.out.println(manager.get(i));
            }
        }
    }

}


