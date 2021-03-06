package caseStudy.controllers._0_main;

import caseStudy.controllers._1_menu_services.AddServicesMainMenu;
import caseStudy.controllers._1_menu_services.ShowServicesMainMenu;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        String choose;
        do{
            System.out.println(
                    "------------------------------------ \n"
                            + "1.Add new Services \n"
                            + "2.Show services \n"
                            + "3.Add new customer \n"
                            + "4.Show information of customer \n"
                            + "5.Add new booking \n"
                            + "6.Show informaton of Employee \n"
                            + "7.Exit \n"
                            + "-----------------------------------"
            );
            System.out.println("Please choose ");
            choose = scanner.nextLine();
            switch (choose){
                case "1" :
                    AddServicesMainMenu.addNewServices();
                    break;
                case "2":
                    ShowServicesMainMenu.showServices();
                    break;
//                case "3":
//                    AddCustomer.addNewCustomer();
//                    break;
//                case "4":
//                    ShowCustomer.showInformationCustomers();
//                    break;
//                case "5":
//                    AddBooking.addNewBooking();
//                    break;
//                case "6":
//                    ShowEmployee.showInforEmployee();
//                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose 1 to 7");
                    displayMainMenu();
                    break;
            }
        }while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <=7);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}