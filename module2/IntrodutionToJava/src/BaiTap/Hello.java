package BaiTap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter Full Name : " );
        String fullName = scanner.nextLine() ;
        System.out.println("Hello " + fullName);
    }
}
