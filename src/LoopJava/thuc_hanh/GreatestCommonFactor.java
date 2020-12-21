package LoopJava.thuc_hanh;

import java.util.Scanner;

//ước số chung lớn nhất
public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = scanner.nextInt();
        System.out.println("Enter b : ");
        int b = scanner.nextInt();
        // Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);
        // Kiểm tra a, b có bằng 0 hay không
        if(a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("Greatest common factor: " + a);
    }
}
