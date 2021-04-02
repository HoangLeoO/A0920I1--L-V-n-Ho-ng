package caseStudy.controllers._1_menu_services;

import caseStudy.commons.ReadFile;
import caseStudy.controllers._0_main.MainController;
import caseStudy.models.House;
import caseStudy.models.Room;
import caseStudy.models.Villa;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ShowServicesMainMenu {
    public static Scanner scanner = new Scanner(System.in);


    public static void showServices(){
        String choose ;
        do {
            System.out.println(
                    "----------------------------------- \n"
                            + "1. Show all Villa \n"
                            + "2. Show all House \n"
                            + "3. Show all Room \n"
                            + "4. Show All Name Villa Not Duplicate \n"
                            + "5. Show All Name House Not Duplicate \n"
                            + "6. Show All Name Room  Not Duplicate \n"
                            + "7. Back to menu \n"
                            + "8. Exit \n"
                            + "------------------------------------"
            );
            System.out.println("please choose");
            choose = scanner.nextLine();
            switch (choose){
                case "1" :
                    showAllVilla();
                    showServices();
                    break;
                case "2" :
                    showAllHouse();
                    showServices();
                    break;
                case "3" :
                    showAllRoom();
                    showServices();
                    break;
                case "4" :
                    showAllNameVillaNoDuplicate();
                    showServices();
                    break;
                case "5" :
                    showAllNameHouseNoDuplicate();
                    showServices();
                    break;
                case "6" :
                    showAllNameRoomNoDulicate();
                    showServices();
                    break;
                case "7" :
                    MainController.displayMainMenu();
                case "8" :
                    System.exit(0);
                default:
                    System.out.println("please choose 1 to 8");

                    break;
            }
        }while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 9);

    }

    private static void showAllNameRoomNoDulicate() {
        ReadFile.readFileRoom();
        int index = 1;
        Set<Room> roomSet = new TreeSet<>(ReadFile.roomList);
        if (ReadFile.roomList.isEmpty()){
            System.out.println("No room exists");
        }else{
            for(Room room : roomSet){
                System.out.println(index++ + " " + room.getName());
            }
        }
    }

    private static void showAllNameHouseNoDuplicate() {
        ReadFile.readFileHouse();
        int index = 1;
        Set<House> houseSet = new TreeSet<>(ReadFile.houseList);
        if(ReadFile.houseList.isEmpty()){
            System.out.println("No house exists");
        }else{
            for(House house : houseSet){
                System.out.println(index++ + ". " + house.getName());
            }
        }
    }

    private static void showAllNameVillaNoDuplicate() {
        ReadFile.readFileVilla();
        int index = 1;
        Set<Villa> villaSet = new TreeSet<>(ReadFile.villaList);
        if(ReadFile.villaList.isEmpty()){
            System.out.println("No villa exists");
        }else {
            for(Villa villa : villaSet){
                System.out.println(index++ + ". " + villa.getName());
            }
        }
    }

    public static void showAllRoom() {
        ReadFile.readFileRoom();
        int index = 1;
        if(ReadFile.roomList.isEmpty()){
            System.out.println("No room exists");
        }else {
            for(Room room: ReadFile.roomList){
                System.out.println(index++ + ". " + room.showInfor());
            }
        }
    }

    public static void showAllHouse() {
        ReadFile.readFileHouse();
        int index = 1;
        if(ReadFile.houseList.isEmpty()){
            System.out.println("No house exists");
        }else{
            for(House house: ReadFile.houseList){
                System.out.println(index++ + ". " + house.showInfor());
            }
        }
    }

    public static void showAllVilla() {
        ReadFile.readFileVilla();
        int index = 1;
        if(ReadFile.villaList.isEmpty()){
            System.out.println("No villa exists");
        }else {
            for (Villa villa : ReadFile.villaList){
                System.out.println(index++ + ". " + villa.showInfor());
            }
        }
    }
}
