package array_method.bai_tap;

import java.util.Scanner;

public class DeleteArray {
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
        System.out.println("Enter element Delete : ");
            int X = scanner.nextInt();
            int index_del = 1;
            for (int n = 0; n < array.length ; n++){
                if (array[n] == X){
                    index_del = n ;
                }
            }
        System.out.println("Index element Delete : " + index_del);
            array[index_del] = array[index_del + 1];
        // in mang
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
