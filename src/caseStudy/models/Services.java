package caseStudy.models;

public abstract class Services {
    private String id ;
    private String name ;
    private double acreage ; // diện tích  dịch vụ
    private int rental_price;
    private int number_of_tenants; // số lượng người tối đa
    private String rental_type ; // kiểu thuê (theo ngày , tháng , năm);

    public Services() {
    }

    public Services(String id, String name, double acreage, int rental_price, int number_of_tenants, String rental_type) {
        this.id = id;
        this.name = name;
        this.acreage = acreage;
        this.rental_price = rental_price;
        this.number_of_tenants = number_of_tenants;
        this.rental_type = rental_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public int getRental_price() {
        return rental_price;
    }

    public void setRental_price(int rental_price) {
        this.rental_price = rental_price;
    }

    public int getNumber_of_tenants() {
        return number_of_tenants;
    }

    public void setNumber_of_tenants(int number_of_tenants) {
        this.number_of_tenants = number_of_tenants;
    }

    public String getRental_type() {
        return rental_type;
    }

    public void setRental_type(String rental_type) {
        this.rental_type = rental_type;
    }
    @Override
    public String toString() {
        return "Services{" +
                "id :'" + id + '\'' +
                ", Tên Dịch vụ  : '" + name + '\'' +
                ", Diện tích sử dụng : " + acreage +
                ", Chi phí thuê : " + rental_price +
                ", Số lượng người tối đa : " + number_of_tenants +
                ", Kiểu thuê " + rental_type + '\'' +
                '}';
    }
    public abstract String showInfor();

}
