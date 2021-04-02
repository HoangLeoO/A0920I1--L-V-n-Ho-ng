package thi_module2.contrllers;



import thi_module2.common.Read;
import thi_module2.sp.San_pham_nk;
import thi_module2.sp.San_pham_xk;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Show {
    public static Scanner scanner = new Scanner(System.in);
    public static void showSP(){
        String choose ;
        do {
            System.out.println(
                    "----------------------------------- \n"
                            + "1. Hien thi tat cac sam pham nhap khau \n"
                            + "2. Hien thi tat cac san pham xuat khau \n"
                            + "3. Back to menu \n"
                            + "4. Exit \n"
                            + "------------------------------------"
            );
            System.out.println("please choose");
            choose = scanner.nextLine();
            switch (choose){
                case "1" :
                    showSPNK();
                    showSP();
                    break;
                case "2" :
                    showSPXK();
                    showSP();
                    break;
                case "4" :
                    System.exit(0);
                default:
                    System.out.println("please choose 1 to 4");

                    break;
            }
        }while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 5);

    }
    private static void showSPNK() {
        Read.readFileSPNK();
        int index = 1;
        Set<San_pham_nk> san_pham_nksSet = new TreeSet<>(Read.spnkList);
        if (Read.spxkList.isEmpty()){
            System.out.println("No exists");
        }else{
            for(San_pham_nk san_pham_nk : san_pham_nksSet){
                System.out.println(index++ + " " + san_pham_nk.getNameSP());
            }
        }
    }
    private static void showSPXK() {
        Read.readFileSPXK();
        int index = 1;
        Set<San_pham_xk> san_pham_xksSet = new TreeSet<>(Read.spxkList);
        if (Read.spxkList.isEmpty()){
            System.out.println("No exists");
        }else{
            for(San_pham_xk san_pham_xk : san_pham_xksSet){
                System.out.println(index++ + " " + san_pham_xk.getNameSP());
            }
        }
    }
}
