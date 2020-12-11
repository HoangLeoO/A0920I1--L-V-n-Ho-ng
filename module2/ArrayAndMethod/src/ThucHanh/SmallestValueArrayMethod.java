package ThucHanh;

import java.util.Scanner;

public class SmallestValueArrayMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] A = new int[size];
        for(int i = 0 ; i< A.length; i++){
            System.out.println("Enter the ele " + (i+1));
            A[i] = sc.nextInt();
        }
        int min = A[0];
        for(int i = 0 ; i< A.length; i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        System.out.println("The element has Min value " + min);
    }
}
