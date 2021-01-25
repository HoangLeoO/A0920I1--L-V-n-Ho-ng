package JavaSchool.demo1.bai3;

import java.util.Scanner;

public class BrandTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        int[] array ;
        do{
            System.out.println("Enter size :");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int a = 0 ;
        while (a < array.length){
            System.out.println("Enter element " + (a+1) + " : " );
            array[a] = scanner.nextInt();
            a++;
        }
        int maxNum = array[0] ;
        int minNum = array[0] ;
        for (int i = 0 ; i < array.length ; i++){
            if(array[i]>maxNum){
                maxNum = array[i];
            }
            if (array[i]<minNum){
                minNum = array[i];
            }
        }
        System.out.println("Hieu suat cua 2 so lon nhat va nho nhat la : " +(maxNum-minNum));
    }
}
