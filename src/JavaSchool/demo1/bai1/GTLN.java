package JavaSchool.demo1.bai1;

import java.util.Scanner;

public class GTLN {
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
        System.out.println("input num : ");
        boolean result = false ;
        int num = scanner.nextInt();
        for(int r = 0 ; r < array.length ; r++){
            if(array[r]>num){
                result = true ;
            }
        }
        System.out.println(result);
    }
}
