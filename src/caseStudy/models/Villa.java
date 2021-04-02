package caseStudy.models;

import caseStudy.commons.ReadFile;

public class Villa extends Services implements Comparable<Villa>{
    private String Standard_room ;
    private String other_services ; // các tiện nghi khác
    private int acreage_pool ; // diện tích hồ bơi
    private int number_floors; // số tầng

    public Villa() {
    }

    public Villa(String standard_room, String other_services, int acreage_pool, int number_floors) {
        Standard_room = standard_room;
        this.other_services = other_services;
        this.acreage_pool = acreage_pool;
        this.number_floors = number_floors;
    }

    public Villa(String id, String name, double acreage, int rental_price, int number_of_tenants, String rental_type, String standard_room, String other_services, int acreage_pool, int number_floors) {
        super(id, name, acreage, rental_price, number_of_tenants, rental_type);
        Standard_room = standard_room;
        this.other_services = other_services;
        this.acreage_pool = acreage_pool;
        this.number_floors = number_floors;
    }

    public String getStandard_room() {
        return Standard_room;
    }

    public void setStandard_room(String standard_room) {
        Standard_room = standard_room;
    }

    public String getOther_services() {
        return other_services;
    }

    public void setOther_services(String other_services) {
        this.other_services = other_services;
    }

    public int getAcreage_pool() {
        return acreage_pool;
    }

    public void setAcreage_pool(int acreage_pool) {
        this.acreage_pool = acreage_pool;
    }

    public int getNumber_floors() {
        return number_floors;
    }

    public void setNumber_floors(int number_floors) {
        this.number_floors = number_floors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Standard_room='" + Standard_room + '\'' +
                ", other_services='" + other_services + '\'' +
                ", acreage_pool=" + acreage_pool +
                ", number_floors=" + number_floors ;
    }

    @Override
    public String showInfor() {
        return "\n" + "Id: " + this.getId()+ "\n" +
                "Ten dich vu : " + this.getName() + "\n" +
                "Diện tích sử dụng : " + this.getAcreage() + "\n" +
                " Chi phí thuê : " + this.getRental_price() + "\n" +
                "Số lượng người tối đa : " + this.getNumber_of_tenants() + "\n" +
                "Kiểu thuê " + this.getRental_type() + "\n" +
                "Loại phòng : " + this.getStandard_room() + "\n" +
                "Mô tả tiện nghi khác : " + this.getOther_services() + "\n" +
                "Diện tích hồ bơi " + this.getAcreage_pool() + "\n" +
                "Số tầng : " + this.getNumber_floors() + "\n";
    }

    public String addFileCsv(){
        return getId() + ReadFile.COMMA +
                getName() + ReadFile.COMMA +
                getAcreage() + ReadFile.COMMA +
                getRental_price() + ReadFile.COMMA +
                getNumber_of_tenants() + ReadFile.COMMA +
                getRental_type() + ReadFile.COMMA +
                getStandard_room() + ReadFile.COMMA +
                getOther_services()+ ReadFile.COMMA +
                getAcreage_pool() + ReadFile.COMMA +
                getNumber_floors() ;

    }

    @Override
    public int compareTo(Villa o) {
        return this.getName().compareTo(o.getName());
    }
}
