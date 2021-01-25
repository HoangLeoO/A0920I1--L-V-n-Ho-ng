package dsa_danh_sach_2.bai_tap.uerStack;

import java.util.Stack;

public class    MyStack {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Stack<Integer> myStack = new Stack<>();

        for (int i = 0 ; i < arr.length ; i++){
            myStack.push(arr[i]);
        }
        System.out.println(myStack);
        Stack<Integer> myStack2 = new Stack<>();
        for (int i = 0 ; i < arr.length ; i++){
            myStack2.push(myStack.pop());
        }
        System.out.println(myStack2);
        String[] arr1 = {"one","two","three"};
        Stack<String> myStack3 = new Stack<>();

        for (int i = 0 ; i < arr1.length ; i++){
            myStack3.push(arr1[i]);
        }
        System.out.println(myStack3);
        Stack<String> myStack4 = new Stack<>();
        for (int i = 0 ; i < arr1.length ; i++){
            myStack4.push(myStack3.pop());
        }
        System.out.println(myStack4);
    }
}
