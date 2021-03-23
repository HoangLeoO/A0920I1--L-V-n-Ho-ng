package thi_module2.Main;

public class San_pham_xk  extends San_pham{
    private double gxk ;
    private String Qgnsp;

    public San_pham_xk() {
    }

    public San_pham_xk(double gxk, String qgnsp) {
        this.gxk = gxk;
        Qgnsp = qgnsp;
    }

    public San_pham_xk(int id, String msp, String nameSP, double gb, int sl, String nsx, double gxk, String qgnsp) {
        super(id, msp, nameSP, gb, sl, nsx);
        this.gxk = gxk;
        Qgnsp = qgnsp;
    }

    public double getGxk() {
        return gxk;
    }

    public void setGxk(double gxk) {
        this.gxk = gxk;
    }

    public String getQgnsp() {
        return Qgnsp;
    }

    public void setQgnsp(String qgnsp) {
        Qgnsp = qgnsp;
    }

    @Override
    public String toString() {
        return super.toString() + "San Pham Xuat khau : " +
                "Gia Xuat Khau : " + gxk +
                ", Quoc Gia Nhap Khau : " + Qgnsp
                ;
    }
}
