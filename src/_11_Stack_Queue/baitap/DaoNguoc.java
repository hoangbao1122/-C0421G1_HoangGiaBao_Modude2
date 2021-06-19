package _11_Stack_Queue.baitap;

import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        // chưa sắp xếp
        System.out.println(myStack);
        // sắp xếp
        for (int i = myStack.peek() - 1 ;i>=0;i--){
            System.out.println(myStack.get(i));
        }
    }
}
