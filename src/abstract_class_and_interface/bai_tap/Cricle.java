package abstract_class_and_interface.bai_tap;

import inheritance.thuc_hanh.geometry.Shape;

class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public  Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter(){
        return  2 * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "A circle with radius = " +
                getRadius() +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + (getRadius() * (percent/100)));
    }

}

