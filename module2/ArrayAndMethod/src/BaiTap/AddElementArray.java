package BaiTap;

import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] array = new int[size * 2];
        for(int i = 0; i < size; i++ ){
            System.out.println("enter ele " + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the value you want to add");
        int valueAdd = sc.nextInt();
        System.out.println("Enter the index you want to add");
        int indexadd = sc.nextInt();
        for (int k = array.length - 1; k >= indexadd; k -- ){
            array[k] = array[k-1];
        }
        array[indexadd] = valueAdd;
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}
