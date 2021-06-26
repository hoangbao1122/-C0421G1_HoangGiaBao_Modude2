package _12_java_collection_framework.baitap;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static LinkedList<Product> manager = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Product product = new Product();
    public static void main(String[] args) {


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
                    edit(manager);
                    break;
                }
                case 4: {
                    remove(manager);
                    break;
                }
                case 5:{
                    search(manager);
                    break;
                }
                case 6:{
                    sort();
                    break;
                }
                default: {
                    System.out.println("mã số bạn nhập ko đúng vui lòng nhập lại");
                    break;
                }
            }
        }
    }

    public static void add(LinkedList<Product> manager){
        System.out.println("nhập vào id sản phẩm");
        int idSanpham = scanner.nextInt();
        System.out.println("nhập vào name sản phẩm");
        String nameSanpham = scanner.next();
        System.out.println("nhập vào giá tiền");
        int money = scanner.nextInt();

        Product newSamPham = new Product(idSanpham,nameSanpham,money);
        manager.add(newSamPham);
    }
    public static void display(LinkedList<Product> manager){
       for (int i = 0 ;i<manager.size();i++){
           System.out.println(manager.get(i));
       }
    }
    public static void remove(LinkedList<Product> manager ){
        System.out.println("nhập vào vị trí index muốn xóa");
        int inputXoa = scanner.nextInt();
        for (int i = 0;i<manager.size();i++){
            if (inputXoa == i){
                manager.remove(i);
                break;
            }
        }
    }
    public static void edit(LinkedList<Product> manager){
        System.out.println("nhập vào id muốn edit");
        int inputSua = scanner.nextInt();
        for (Product products : manager){
           if (inputSua == products.getId()){
                   System.out.println("nhập vào tên muốn đổi");
                   String inputName = scanner.next();
                   products.setProduct(inputName);
                   System.out.println("nhập vào số tiền muốn đổi");
                   int inputMoney = scanner.nextInt();
                   products.setMoney(inputMoney);

           }
       }
    }
    public static void search(LinkedList<Product> manager){
        System.out.println("nhập vào index  sản phẩm");
        int input = scanner.nextInt();
        for (int i = 0;i<manager.size();i++){
            if (input == i){
                System.out.println(manager.get(i));
            }
        }
    }
    public static void sort(){
        Collections.sort(manager,new MoneyComparator());
        display(manager);
    }

}


