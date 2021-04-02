package caseStudy.models;

import caseStudy.commons.ReadFile;

public class Room  extends Services implements Comparable <Room>{
    private String accompaniedServiceFree;//: Dịch vụ miễn phí đi kèm.

    public Room(String accompaniedServiceFree) {
        this.accompaniedServiceFree = accompaniedServiceFree;
    }

    public Room(String id, String name, double acreage, int rental_price, int number_of_tenants, String rental_type, String accompaniedServiceFree) {
        super(id, name, acreage, rental_price, number_of_tenants, rental_type);
        this.accompaniedServiceFree = accompaniedServiceFree;
    }

    public Room() {
    }

    public String getAccompaniedServiceFree() {
        return accompaniedServiceFree;
    }

    public void setAccompaniedServiceFree(String accompaniedServiceFree) {
        this.accompaniedServiceFree = accompaniedServiceFree;
    }

    @Override
    public String showInfor() {
        return "\n" + "Id: " + this.getId()+ "\n" +
                "Ten dich vu : " + this.getName() + "\n" +
                "Diện tích sử dụng : " + this.getAcreage() + "\n" +
                " Chi phí thuê : " + this.getRental_price() + "\n" +
                "Số lượng người tối đa : " + this.getNumber_of_tenants() + "\n" +
                "Kiểu thuê " + this.getRental_type() + "\n" +
                "Dịch vụ miễn phí đi kèm : " + this.getAccompaniedServiceFree() ;
    }
    public String addFileCsv(){
        return getId() + ReadFile.COMMA +
                getName() + ReadFile.COMMA +
                getAcreage() + ReadFile.COMMA +
                getRental_price() + ReadFile.COMMA +
                getNumber_of_tenants() + ReadFile.COMMA +
                getRental_type() + ReadFile.COMMA +
                getAccompaniedServiceFree();
    }
    @Override
    public int compareTo(Room o) {
        return this.getName().compareTo(o.getName());
    }
}
