package caseStudy.models;

public class Villa extends Services {
    private String Standard_room ;
    private String other_services ; // các tiện nghi khác
    private int acreage_pool ; // diện tích hồ bơi
    private int number_floors; // số tầng


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
        return "Villa{" +
                "Standard_room='" + Standard_room + '\'' +
                ", other_services='" + other_services + '\'' +
                ", acreage_pool=" + acreage_pool +
                ", number_floors=" + number_floors +
                '}';
    }
}
