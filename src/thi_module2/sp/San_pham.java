package thi_module2.Main;

public abstract class San_pham {
    private int Id ;
    private String Msp ;
    private String nameSP ;
    private double Gb ;
    private int Sl ;
    private String Nsx ;

    public San_pham() {
    }

    public San_pham(int id, String msp, String nameSP, double gb, int sl, String nsx) {
        Id = id;
        Msp = msp;
        this.nameSP = nameSP;
        Gb = gb;
        Sl = sl;
        Nsx = nsx;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMsp() {
        return Msp;
    }

    public void setMsp(String msp) {
        Msp = msp;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public double getGb() {
        return Gb;
    }

    public void setGb(double gb) {
        Gb = gb;
    }

    public int getSl() {
        return Sl;
    }

    public void setSl(int sl) {
        Sl = sl;
    }

    public String getNsx() {
        return Nsx;
    }

    public void setNsx(String nsx) {
        Nsx = nsx;
    }

    @Override
    public String toString() {
        return "San Pham :" +
                "Id : " + Id +
                ", Ma San Pham :" + Msp + '\'' +
                ", Ten San Pham " + nameSP + '\'' +
                ", Gia Ban " + Gb +
                ", So Luong " + Sl +
                ", Nha San Xuat " + Nsx + '\'' +
                '}';
    }
}
