package _11_Stack_Queue.option.baitap;

import java.util.Scanner;
import java.util.Stack;

public class BieuThuc {
    public static boolean check(String str){
        Stack<Character> stack = new Stack<>();
        char left;
        for (int i = 0;i<str.length();i++){
            left = str.charAt(i);
            if (left == '('){
                stack.push(left);
            }else if (left == ')'){
                if (stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào biểu thức");
        String nhap = scanner.next();
        boolean run = check(nhap);
        System.out.println(run);
    }
}
