package thi_module2.contrllers;


import java.util.Scanner;

public class MainMenu {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        String choose;
        do{
            System.out.println(
                    "------------------------------------ \n"
                            + "1.Them Moi \n"
                            + "2.Xoa \n"
                            + "3.Xem Danh Sach Cac San Pham \n"
                            + "4.Tim Kiem \n"
                            + "5.Thoat \n"
                            + "-----------------------------------"
            );
            System.out.println("Please choose ");
            choose = scanner.nextLine();
            switch (choose){
                case "1" :
                    AddMenu.addSanPham();
                    break;
                case "3" :
                    Show.showSP();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose 1 to 5");
                    displayMainMenu();
                    break;
            }
        }while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <=7);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
