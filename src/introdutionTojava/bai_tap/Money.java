package introdutionTojava.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount USD : "); // amount  : số tiền
        double usd = scanner.nextDouble();
        double vnd = usd*23000;
        System.out.println("VND = " + vnd);
    }
}
