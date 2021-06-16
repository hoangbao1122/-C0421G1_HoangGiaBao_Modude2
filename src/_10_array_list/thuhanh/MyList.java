package _10_array_list.thuhanh;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    private Object element[];

    public MyList() {
        System.out.println("kích thước " + DEFAULT_CAPACITY);
        element = new Object[DEFAULT_CAPACITY];
    }
    public void encapcity(){
        int newArray;
        newArray = element.length * 2;
        element = Arrays.copyOf(element,newArray);

    }
    public void add(int e){
        if (size == element.length){
            encapcity();
        }
        element[size++] = e;
    }
    public int get(int i){
        if (i>=size || i< 0 ){
             System.out.println(" bạn nhập bị sai");
        }
        return (int) element[i];
    }
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(4); // thêm phần tử ở vị trị bắt đầu từ 0
        listInteger.add(2);
        System.out.println(listInteger.get(0)); // lấy ra phần tử ở vị trí
        System.out.println(listInteger.get(1));
        for (int i =0;i<listInteger.get(i);i++){
            System.out.println(listInteger.get(i));
        }
    }
}
