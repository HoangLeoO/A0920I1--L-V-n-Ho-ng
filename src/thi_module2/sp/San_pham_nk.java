package thi_module2.Main;

public class San_pham_nk extends San_pham {
    private double Gnk;
    private double Tnk;

    public San_pham_nk() {
    }

    public San_pham_nk(double gnk, double tnk) {
        Gnk = gnk;
        Tnk = tnk;
    }

    public San_pham_nk(int id, String msp, String nameSP, double gb, int sl, String nsx, double gnk, double tnk) {
        super(id, msp, nameSP, gb, sl, nsx);
        Gnk = gnk;
        Tnk = tnk;
    }

    public double getGnk() {
        return Gnk;
    }

    public void setGnk(double gnk) {
        Gnk = gnk;
    }

    public double getTnk() {
        return Tnk;
    }

    public void setTnk(double tnk) {
        Tnk = tnk;
    }

    @Override
    public String toString() {
        return super.toString() + "San Pham Nhap  Khau :" +
                "Gia Nhap Khau :" + Gnk +
                ", Thue Nhap Khau  :" + Tnk
                ;
    }
}
