package array_method.bai_tap;

import java.util.Scanner;

public class ArrayAggregation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 ;
        int size2 ;
        int[] array1 ;
        int[] array2 ;
        do{
            System.out.println("Enter size arr 1 : ");
            size1 = scanner.nextInt();
            if(size1 > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size1 > 20);
        array1 = new int[size1];
        int i =  0 ;
        while (i < array1.length){
            System.out.println("Enter element " + (i+1) + ":");
            array1[i] = scanner.nextInt();
            i++ ;
        }
        do{
            System.out.println("Enter size arr2 : ");
            size2 = scanner.nextInt();
            if(size2 > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size2 > 20);
        array2 = new int[size2];
        int n =  0 ;
        while (n < array2.length){
            System.out.println("Enter element " + (n+1) + ":");
            array2[n] = scanner.nextInt();
            n++ ;
        }

        int size3 = size1 + size2 ;
        int[] array3 = new int[size3];
        for (int z = 0 ; z < array1.length ; z++ ){
            array3[z] = array1[z];
        }
        int a = 0;
        for (int x = array1.length ; x < array3.length; x++){
            array3[x]= array2[a];
            a++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "\t");
        }
    }
}
