package classVsOPP.baiTap.Qua;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double detal = quadraticEquation.getDiscriminant(a,b,c);
        if (detal > 0){
            double x1 = quadraticEquation.getRoot1(a,b,c);
            double x2 = quadraticEquation.getRoot2(a,b,c);
            System.out.println("Phuong trình có 2 nghiệm phân biệt:");
            System.out.println("Nghiệm x1 = " +x1);
            System.out.println("Nghiệm x2 = " +x2);
        }else if(detal == 0){
            double x3 = quadraticEquation.getRoot3(a,b);
            System.out.println("Phương trình có nghiệm kém x1 = x2 = " + x3);
        }else if (detal < 0){
            System.out.println("Phương trình vô nghiệm");
        }

    }
}

