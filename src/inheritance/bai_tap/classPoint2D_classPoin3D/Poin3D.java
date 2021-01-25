package inheritance.bai_tap.classPoint2D_classPoin3D;

public class Poin3D extends Point2D{
    private float z = 0.0f ;

    public Poin3D() {

    }

    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        setX(x);
        setY(y);
        this.z = z ;
    }
    public  float[] getXYZ(){
        float[] arr = {super.getX(),super.getY(),z};
        return arr ;
    }

    @Override
    public String toString() {
        return "z= " + z + super.toString();
    }

}
