package array_method.bai_tap;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        int[] array ;
        do{
            System.out.println("Enter size : ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int i =  0 ;
        while (i < array.length){
            System.out.println("Enter element " + (i+1) + ":");
            array[i] = scanner.nextInt();
            i++ ;
        }
        // mang trc khi chen
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("Enter element add : " );
         int x = scanner.nextInt();
        System.out.println("Enter index add : ");
         int index = scanner.nextInt();
         if(index <= 1 || index >= array.length){
             System.out.println("Not add element !");
         }else {
             array[index] = x ;
             // mang sau khi chen
             System.out.print("Property list: ");
             for (int n = 0; n < array.length; n++) {
                 System.out.print(array[n] + "\t");
             }
         }

    }
}
