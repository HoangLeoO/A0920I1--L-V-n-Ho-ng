package BaiTap;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        int unit = 0, dozen = 0, hundreds = 0;
        if(number == 11){
            System.out.println("eleven");
        }else if(number == 12){
            System.out.println("twelve");
        }else {
            if(number < 1000 && number > 99){
                unit = number % 10;
                number = number / 10;
                dozen = number % 10;
                number = number / 10;
                hundreds = number % 10;
            }else if(number > 10 && number <20){
                dozen = number;
            }else if(number > 19){
                unit = number % 10;
                number =  number / 10;
                dozen = number;
            }else if(number > 0){
                unit = number;
            }else{
                System.out.println("Failed");
            }
        }


        switch (hundreds) {
            case 1:
                System.out.print("One hunderd ");
                break;
            case 2:
                System.out.print("Tow hunderd ");
                break;
            case 3:
                System.out.print("Three hunderd ");
                break;
            case 4:
                System.out.print("Four hunderd ");
                break;
            case 5:
                System.out.print("Five hunderd ");
                break;
            case 6:
                System.out.print("Six hunderd ");
                break;
            case 7:
                System.out.print("Seven hunderd ");
                break;
            case 8:
                System.out.print("Eight hunderd ");
                break;
            case 9:
                System.out.print("Nine hunderd ");
                break;
        }

        switch (dozen) {
            case 1:

                break;
            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Forty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixties ");
                break;
            case 7:
                System.out.print("Seventis ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
            case 11:
                System.out.print("Eleven ");
                break;
            case 12:
                System.out.print("Twelve ");
                break;
            case 13:
                System.out.print("Thirteen ");
                break;
            case 14:
                System.out.print("Fourteen ");
                break;
            case 15:
                System.out.print("Fifteen ");
                break;
            case 16:
                System.out.print("Sisteen ");
                break;
            case 17:
                System.out.print("Seventeen ");
                break;
            case 18:
                System.out.print("Eighteen ");
                break;
            case 19:
                System.out.print("Nineteen ");
                break;
        }

        switch (unit) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 10:
                System.out.print("Ten ");
                break;
        }


    }
}
