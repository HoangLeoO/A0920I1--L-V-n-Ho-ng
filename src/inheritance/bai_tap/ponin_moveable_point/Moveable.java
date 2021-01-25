package inheritance.bai_tap.ponin_moveable_point;

public class Moveable extends Ponit {
    private float xSpeed = 0.0f ;
    private float ySpeed = 0.0f ;
    public Moveable(){

    }

    public Moveable(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveable(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public float[] getSpeed(){
        float[] array = {xSpeed , ySpeed};
        return  array ;
    }

    @Override
    public String toString() {
        return "x = " + super.getX() + "y = " + super.getY() + " speed = (" +getxSpeed() + "," + getySpeed() + ")";
    }
    public Moveable move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+xSpeed);
        return this;
    }
}
