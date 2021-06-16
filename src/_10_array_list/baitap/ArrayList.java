package _10_array_list.baitap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10 ;
    public Object elements[];

    public ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public ArrayList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        }else {
            System.out.println("capacity pải lớn hơn 0");
        }
    }
    public int getSize(){
        return this.size;
    }
    public void clear(){
        this.size = 0;
        for (int i = 0; i< elements.length; i++){
            elements[i] = null;
        }
    }
    public boolean add(E element){
        if (elements.length == size) {
                this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public void add(E element,int index)    {
        if (index > elements.length){
            System.out.println("lỗi");
        }else if(elements.length == size){
            this.ensureCapacity(5);
        }
        if (elements[index]==null){
            elements[index] = element;
        }else {
            for (int i =size +1;i>=index;i--){
                elements[i] = elements[i-1];

            }
            elements[index] = element;
            size++;
        }
    }

    /// tăng kích thc cảu arr
    public void ensureCapacity(int minCapacity){
        if (minCapacity>=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else {
            System.out.println("lỗi");
        }
    }
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index = -1;
        for (int i = 0;i<size;i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    public boolean contains(E element){
        return this.indexOf(element) >= 0;
    }
    public ArrayList<E> clone(){
        ArrayList<E> arrayCop = new ArrayList<>();
        arrayCop.elements = Arrays.copyOf(this.elements,this.size);
        arrayCop.size = this.size;
        return arrayCop;
    }
    public E remove(int index){
        if (index<0 || index > elements.length){
            System.out.println("error");
        }
        E element = (E) elements[index];
        for (int i = 0;i<size -1;i++){
            elements[i] = elements[i+1];
            }
        elements[size - 1] = null;
        size--;
        return element;
        }


    }


