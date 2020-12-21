package LoopJava.bai_tap;

import java.util.Scanner;

public class SNT20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of prime Print");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        if(number <= 0){
            System.out.println("please enter positive number");
        }else{
            while(count < number){
                boolean check = true;
                for(int i = 2; i <= Math.sqrt(n); i ++ ) {
                    if (n % i == 0) {
                        check = false;

                    }
                }
                if(check == true){
                    count ++;
                    System.out.println( n + " ");
                }
                n++;
            }
        }
    }
}
