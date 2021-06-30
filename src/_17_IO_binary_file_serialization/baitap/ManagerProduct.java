package _17_IO_binary_file_serialization.baitap;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ManagerProduct {
    private static Product product = new Product();
    private static List<Product> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhập vào chức năng muốn chọn");
            System.out.println("chức năng 1 : hiển thị danh sách");
            System.out.println("chức năng 2 : thêm sản phẩm");
            System.out.println("chức năng 3 : tìm kiếm theo id sản phẩm");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    readFile("manager.txt");
                    for (Product products : list) {
                        System.out.println(products);
                    }
                    break;
                }
                case 2: {
                    System.out.println("nhập vào id sản phẩm");
                    int idProdcut = scanner.nextInt();
                    System.out.println("nhập vào name sản phẩm");
                    String name = scanner.next();
                    System.out.println("nhập vào hãn sản xuất");
                    String manufactuner = scanner.next();
                    System.out.println("nhập vào số tiền");
                    double money = scanner.nextDouble();
                    System.out.println("Mo tả khác");
                    String mota = scanner.next();
                    list.add(new Product(idProdcut, name, manufactuner, money, mota));
                    writeFile("manager.txt", list);
                    break;
                }
                case 3: {
                    System.out.println("nhập vào id sản phẩm muốn tìm kiếm");
                    int searchNumber = scanner.nextInt();
                    search(searchNumber);
                    break;
                }
                default: {
                    System.out.println("số bạn nhập ko đúng");
                    break;
                }
            }
        }
    }
    public static void writeFile(String pathFile, List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(String pathFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(pathFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void search(int id) {
        boolean check = false;
        for (Product products:list){
            if (id == products.getIdProduct()){
                check = true;
                System.out.println(products);
            }
        }
        if (check == false){
            System.out.println("ko có");
        }
    }
}