package JavaSchool.demo1.bai4;

import java.util.Scanner;

public class SortString {
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
        while (a < array.length) {
            System.out.println("Enter element " + (a + 1) + " : ");
            array[a] = scanner.nextInt();
            a++;
        }
        boolean result = false ;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]<array[i+1]){
                result = true ;
            }
        }
        System.out.println(result);
    }
}
