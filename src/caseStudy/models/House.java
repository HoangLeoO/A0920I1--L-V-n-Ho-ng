package caseStudy.models;

import caseStudy.commons.ReadFile;

public class House extends Services implements Comparable<House>  {
    private String standardRoom;
    private String comfortDescription;
    private int numberofFloors;

    public House(String standardRoom, String comfortDescription, int numberofFloors) {
        this.standardRoom = standardRoom;
        this.comfortDescription = comfortDescription;
        this.numberofFloors = numberofFloors;
    }

    public House(String id, String name, double acreage, int rental_price, int number_of_tenants, String rental_type, String standardRoom, String comfortDescription, int numberofFloors) {
        super(id, name, acreage, rental_price, number_of_tenants, rental_type);
        this.standardRoom = standardRoom;
        this.comfortDescription = comfortDescription;
        this.numberofFloors = numberofFloors;
    }

    public House() {
    }

    public House(int parseInt, String comfortDescription, String s) {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public int getNumberofFloors() {
        return numberofFloors;
    }

    public void setNumberofFloors(int numberofFloors) {
        this.numberofFloors = numberofFloors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", comfortDescription='" + comfortDescription + '\'' +
                ", numberofFloors=" + numberofFloors
                ;
    }

    @Override
    public String showInfor() {
        return "\n" + "Id: " + this.getId()+ "\n" +
                "Ten dich vu : " + this.getName() + "\n" +
                "Diện tích sử dụng : " + this.getAcreage() + "\n" +
                " Chi phí thuê : " + this.getRental_price() + "\n" +
                "Số lượng người tối đa : " + this.getNumber_of_tenants() + "\n" +
                "Kiểu thuê " + this.getRental_type() + "\n" +
                "Loại phòng: " + this.getStandardRoom() + "\n" +
                "Mô tả tiện nghi khác : " + this.getComfortDescription() + "\n" +
                "Số tầng : " + this.getNumberofFloors();
    }
    public String addFileCsv(){
        return getId() + ReadFile.COMMA +
                getName() + ReadFile.COMMA +
                getAcreage() + ReadFile.COMMA +
                getRental_price() + ReadFile.COMMA +
                getNumber_of_tenants() + ReadFile.COMMA +
                getRental_type() + ReadFile.COMMA +
                getStandardRoom() + ReadFile.COMMA +
                getComfortDescription() + ReadFile.COMMA +
                getNumberofFloors();

    }


    @Override
    public int compareTo(House o) {
        return this.getName().compareTo(o.getName());
    }
}
