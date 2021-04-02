package caseStudy.commons;

import caseStudy.models.House;
import caseStudy.models.Room;
import caseStudy.models.Villa;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String COMMA = ",";
    public static final String PATH_FILE_VILLA = "src/caseStudy/data/villa.csv";
    public static final String PATH_FILE_ROOM = "src/caseStudy/data/room.csv";
    public static final String PATH_FILE_HOUSE = "src/caseStudy/data/house.csv";
    public static List<Villa> villaList;
    public static List<House> houseList;
    public static List<Room> roomList;

    public static void readFileVilla() {
        villaList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(PATH_FILE_VILLA);
        for (String string : stringList) {
            String[] stringSplit = string.split(",");
            Villa villa = new Villa(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Integer.parseInt(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7],
                    Integer.parseInt(stringSplit[8]), Integer.parseInt(stringSplit[9]));
            villaList.add(villa);
        }

    }
    public static void readFileHouse(){
        houseList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(PATH_FILE_HOUSE);
        for (String string : stringList) {
            String[] stringSplit = string.split(",");
            House house = new House(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Integer.parseInt(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7], Integer.parseInt(stringSplit[8]));
            houseList.add(house);
        }
    }
    public static void readFileRoom(){
        roomList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(PATH_FILE_ROOM);
        for(String string : stringList){
            String[] stringSplit = string.split(",");
            Room room = new Room(stringSplit[0],stringSplit[1],Double.parseDouble(stringSplit[2]),
                    Integer.parseInt(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5],stringSplit[6]);
            roomList.add(room);
        }
    }
}