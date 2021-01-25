package abstract_class_and_interface.bai_tap;

import inheritance.thuc_hanh.geometry.Shape;

public class ResizeableTest {
    public static void main(String[] args) {

/*        Resizeable resizeable = new Circle();
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        circle.resize(10);
        System.out.println(circle.getArea());
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square = new Square(5.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.resize(50);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());*/

        Shape[] arr = { new Square(6), new Circle(6)};

        for(Shape shape : arr){
            double random = Math.random();

            if (shape instanceof Square){
                System.out.println("area before: " + ((Square) shape).getArea());
                ((Square) shape).resize(random*100);
                System.out.println("area after: " + ((Square) shape).getArea());
            }

            if (shape instanceof Circle){
                System.out.println("area before " + ((Circle) shape).getArea());
                ((Circle) shape).resize(random * 100);
                System.out.println("area after: " + ((Circle) shape).getArea());
            }

        }
    }
}
