package caseStudy.controllers._1_menu_services;

import caseStudy.commons.FileUntil;
import caseStudy.commons.ReadFile;
import caseStudy.controllers.RegularException;
import caseStudy.controllers._0_main.MainController;
import caseStudy.exceptions.AreaServiceException;
import caseStudy.exceptions.CostServicesException;
import caseStudy.exceptions.IdServicesException;
import caseStudy.exceptions.NameServicesException;
import caseStudy.models.House;
import caseStudy.models.Room;
import caseStudy.models.Villa;

import java.util.Scanner;

public class AddServicesMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    private static String nameServices;
    private static String area;
    private static String cost;
    private static String amountOfPeopleMax;
    private static String rentType;
    public static void addNewServices(){
        String choose;
        do {
            System.out.println(
                    "----------------------------------- \n"
                            + "1. Add new villa \n"
                            + "2. Add new house \n"
                            + "3. Add new room \n"
                            + "4. Back to menu \n"
                            + "5. Exit \n"
                            + "------------------------------------"
            );
            System.out.println("Enter choose");
            choose = scanner.nextLine();
            switch (choose){
                case "1" :
                    addNewVilla();
                    addNewServices();
                    break;
                case "2" :
                    addNewHouse();
                    addNewServices();
                    break;
                case "3" :
                    addNewRoom();
                    addNewServices();
                    break;
                case "4" :
                    MainController.displayMainMenu();
                    break;
                case "5" :
                    System.exit(0);
                default:
                    System.out.println("please choose 1 to 5");
                    addNewServices();
                    break;
            }
        }while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 6);
    }
    /*INPUT GENERAL INFORMATION FOR SERVICES*/

    public static void generalInformationServices() {
        boolean flag;

        do {
            flag = true;
            try {
                System.out.println("Enter the name services");
                nameServices = scanner.nextLine();
                RegularException.validateNameService(nameServices);
            } catch (NameServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            try {
                System.out.println("Enter the area");
                area = scanner.nextLine();
                RegularException.validateAreaService(area);
            } catch (AreaServiceException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            try {
                System.out.println("Enter the cost");
                cost = scanner.nextLine();
                RegularException.validateCostService(cost);
            } catch (CostServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;

            try {
                System.out.println("Enter the mount of people: ");
                amountOfPeopleMax = scanner.nextLine();
                RegularException.validateAmountPeopleService(amountOfPeopleMax);
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            try {
                System.out.println("Enter the rent type");
                rentType = scanner.nextLine();
                RegularException.validateNameService(rentType);
            } catch (NameServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);
    }

    /*ADD NEW ROOM*/

    public static void addNewRoom() {
        ReadFile.readFileRoom();
        String idRoom;
        String accompaniedServiceFree;

        boolean flag;

        do {
            flag = true;
            System.out.println("Enter the id room");
            idRoom = scanner.nextLine();
            try {
                RegularException.validateIdRoom(idRoom);
            } catch (IdServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
            for(Room room : ReadFile.roomList){
                if(room.getId().equals(idRoom)){
                    System.out.println("ID have exists");
                    flag = false;
                }
            }

        }while (!flag);

        generalInformationServices();

        System.out.println("Enter the accompanied Service Free");
        accompaniedServiceFree = scanner.nextLine();

        Room room = new Room(idRoom, nameServices, Double.parseDouble(area), Integer.parseInt(cost),
                Integer.parseInt(amountOfPeopleMax), rentType, accompaniedServiceFree);
        String line = room.addFileCsv();
        FileUntil.writeInFile(ReadFile.PATH_FILE_ROOM, line);
        System.out.println("SUCCESS");

    }
    /*ADD NEW HOUSE*/

    public static void addNewHouse() {
        ReadFile.readFileHouse();
        boolean flag;

        String idHouse;
        String standardRoom;
        String comfortDescription;
        String numberofFloors;

        do {
            flag = true;
            System.out.println("Enter the id house");
            idHouse = scanner.nextLine();
            try {
                RegularException.validateIdHouse(idHouse);
            } catch (IdServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
            for(House house : ReadFile.houseList){
                if(house.getId().equals(idHouse)){
                    System.out.println("ID have exists");
                    flag = false;
                }
            }

        }while (!flag);

        generalInformationServices();

        do{
            flag = true;
            System.out.println("Enter the standard room");
            standardRoom = scanner.nextLine();
            try {
                RegularException.validateNameService(standardRoom);
            } catch (NameServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

        System.out.println("Enter the comfort Description");
        comfortDescription = scanner.nextLine();

        do{
            flag = true;
            System.out.println("Enter number Of Floors");
            numberofFloors = scanner.nextLine();
            try {
                RegularException.validateNumberOfFloorService(numberofFloors);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

        House house = new House(idHouse, nameServices, Double.parseDouble(area), Integer.parseInt(cost),
                Integer.parseInt(amountOfPeopleMax), rentType, standardRoom, comfortDescription,
                Integer.parseInt(numberofFloors));
        String line = house.addFileCsv();
        FileUntil.writeInFile(ReadFile.PATH_FILE_HOUSE, line);
        System.out.println("SUCCESS");
    }

    /*ADD NEW VILLA*/

    public static void addNewVilla() {

        ReadFile.readFileVilla();

        boolean flag;

        String idVilla = null;
        String standardRoom;
        String comfortableDecription;
        String poolArea;
        String numberOfFloors;
        do{
            flag = true;
            try {
                System.out.println("Enter the id villa");
                idVilla = scanner.nextLine();
                RegularException.validateIdVilla(idVilla);

            }catch (IdServicesException e){
                System.out.println(e.getMessage());
                flag = false;
            }

            for (Villa villa : ReadFile.villaList){
                if (villa.getId().equals(idVilla)){
                    System.out.println("ID have exists");
                    flag = false;
                }
            }

        }while (!flag);

        generalInformationServices();

        do{
            flag = true;
            System.out.println("Enter the standard room");
            standardRoom = scanner.nextLine();
            try {
                RegularException.validateNameService(standardRoom);
            } catch (NameServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);


        System.out.println("Enter comfortable Decription");
        comfortableDecription = scanner.nextLine();

        do{
            flag = true;
            System.out.println("Enter the pool Area");
            poolArea = scanner.nextLine();
            try {
                RegularException.validateAreaService(poolArea);
            } catch (AreaServiceException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

        do{
            flag = true;
            System.out.println("Enter number Of Floors");
            numberOfFloors = scanner.nextLine();
            try {
                RegularException.validateNumberOfFloorService(numberOfFloors);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);


        Villa villa = new Villa(idVilla, nameServices, Double.parseDouble(area), Integer.parseInt(cost),
                Integer.parseInt(amountOfPeopleMax), rentType, standardRoom
                ,comfortableDecription, Integer.parseInt(poolArea), Integer.parseInt(numberOfFloors));

        String line = villa.addFileCsv();
        FileUntil.writeInFile(ReadFile.PATH_FILE_VILLA, line);

        System.out.println("SUCCESS");

    }
}
