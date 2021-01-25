package inheritance.bai_tap.classCircleAndClassCylinder;

public class Cylinder extends Circle{
    private double height ;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double TheTich(){
        return height*getRadius()*getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return  "A Cylinder height with " + height
                + " , radius " + getRadius() + "The tich "+ TheTich() +
                 ",which is a subclass of " + super.toString();
    }
}
