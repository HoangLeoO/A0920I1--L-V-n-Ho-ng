package inheritance.bai_tap.ponin_moveable_point;

public class Ponit {
    private float x = 0.0f ;
    private float y = 0.0f ;

    public Ponit() {
    }

    public Ponit(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x = x ;
        this.y = y ;
    }
    public float[] getXY(){
        float[] arr = {x,y};
        return arr ;
    }
    @Override
    public String toString(){
        return "x= " + getX() + ", y= " + getY();
    }
}
