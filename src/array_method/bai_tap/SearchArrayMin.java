package array_method.bai_tap;

import java.util.Scanner;

public class SearchArrayMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        int [] arr ;
        do {
            System.out.println("Enter size : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);
            arr = new int[size];
            int i = 0 ;
            while (i<arr.length){
                System.out.println("Enter element " + (i+1) + ":");
                arr[i] = scanner.nextInt();
                i++;
            }
        System.out.print("Property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int min = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.println("Element array : " + min + " ,at position " + index);
    }
}
