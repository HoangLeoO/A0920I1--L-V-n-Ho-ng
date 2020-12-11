package ThucHanh;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Money : ");
        double money =  scanner.nextDouble();
        System.out.println("Enter Month : ");
        int month = scanner.nextInt();
        System.out.println("Enter interset_rate : ");
        double  interset_rate = scanner.nextDouble(); // tỉ suất lãi
        double interest = 0 ; // tiền lãi
        for(int i = 0; i < month; i++){
            interest += money * (interset_rate/100)/12 * month;

        }
        System.out.println("Interest is : " + interest);
    }
}
