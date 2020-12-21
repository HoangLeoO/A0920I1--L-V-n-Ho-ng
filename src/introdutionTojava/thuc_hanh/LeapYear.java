package introdutionTojava.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int Year = scanner.nextInt();
        if(Year % 4 == 0){
            if(Year % 100 == 0){
                if (Year % 400 == 0){
                    System.out.println(Year + " is leap year !");
                }else {
                    System.out.println(Year + " isn't leap year !");
                }
            }else {
                System.out.println(Year + " isn't leap year !");
            }
        }else {
            System.out.println(Year + "isn't leap year !");
        }
    }
}
