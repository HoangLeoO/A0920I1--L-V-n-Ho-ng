package thi_module2.contrllers;

import thi_module2.common.File;
import thi_module2.common.Read;
import thi_module2.sp.San_pham_nk;
import thi_module2.sp.San_pham_xk;

import java.util.Scanner;

public class AddMenu {
    public static Scanner scanner = new Scanner(System.in);
    private static String id;
    private static String Msp;
    private static String nameSp;
    private static String Gb;
    private static String Sl;
    private static String Nsx;

    public static void addSanPham() {
        String choose;
        do {
            System.out.println(
                    "----------------------------------- \n"
                            + "1. Them San Pham Nhap Khau \n"
                            + "2. Them San Pham Xuat Khau \n"
                            + "3. Thoat \n"
                            + "------------------------------------"
            );
            System.out.println("Enter choose");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addSanPhamNK();
                    addSanPham();
                    break;
                case "2":
                    addSanPhamXK();
                    addSanPham();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("please choose 1 to 3");
                    addSanPham();
                    break;
            }
        } while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 4);
    }
    public static void sP() {
        System.out.println("Nhap id :");
        id = scanner.nextLine();
        System.out.println("Nhap Ma san pham :");
        Msp = scanner.nextLine();
        System.out.println("Nhap ten san pham :");
        nameSp = scanner.nextLine();
        System.out.println("Nhap gia ban :");
        Gb = scanner.nextLine();
        System.out.println("Nhap so luong : ");
        Sl = scanner.nextLine();
        System.out.println("Nhap nha san xuat :");
        Nsx =scanner.nextLine();
    }
//
    public static void addSanPhamNK(){
            Read.readFileSPNK();
            String gnk;
            String tnk;
            sP();
            System.out.println("Nhap gia nhap khau :");
            gnk = scanner.nextLine();
            System.out.println("Nhap gia thue nhap khau :");
            tnk = scanner.nextLine();
            San_pham_nk san_pham_nk = new San_pham_nk(Integer.parseInt(id), Msp, nameSp, Double.parseDouble(Gb), Integer.parseInt(Sl), Nsx, Double.parseDouble(gnk), Double.parseDouble(tnk));
            String line = san_pham_nk.addFile();
            File.writeInFile(Read.PATH_FILE_SPNK, line);
            System.out.println("SUCCESS");
        }
    public static void addSanPhamXK(){
        Read.readFileSPNK();
        String gxk;
        String qgnsp;
        sP();
        System.out.println("Nhap gia xuat khau :");
        gxk = scanner.nextLine();
        System.out.println("Quoc gia nhap san pham");
        qgnsp = scanner.nextLine();
        San_pham_xk san_pham_xk = new San_pham_xk(Integer.parseInt(id), Msp, nameSp, Double.parseDouble(Gb), Integer.parseInt(Sl), Nsx, Double.parseDouble(gxk), qgnsp);
        String line = san_pham_xk.addFile();
        File.writeInFile(Read.PATH_FILE_SPXK, line);
        System.out.println("SUCCESS");
    }
}