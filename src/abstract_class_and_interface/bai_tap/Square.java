package abstract_class_and_interface.bai_tap;


import inheritance.thuc_hanh.geometry.Rectangle;

public class Square extends Rectangle implements Resizeable {

    @Override
    public void resize(double percent) {
        setSide(getSide() + (getSide() * (percent/100)));
    }


    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }



    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
