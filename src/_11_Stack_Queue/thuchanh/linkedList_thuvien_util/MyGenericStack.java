package _11_Stack_Queue.thuchanh.linkedList_thuvien_util;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void  push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        return stack.pop();
    }
    public int size(){
        return  stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

    public T get(){
        return (T) this.stack;
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println("element "+ stack.get());
        System.out.println("size "+stack.size());
        System.out.println("xoa");
        stack.pop();
        System.out.println("element "+ stack.get());
        System.out.println("size " + stack.size());
    }
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("hoang");
        stack.push("goa");
        stack.push("bao");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }

    public static void main(String[] args) {
        stackOfIntegers();
        System.out.println("");
        stackOfIStrings();
    }

}
