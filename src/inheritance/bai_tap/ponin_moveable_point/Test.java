package inheritance.bai_tap.ponin_moveable_point;

public class Test {
    public static void main(String[] args) {
        Ponit ponit = new Ponit(1.0f,2.0f);
        System.out.println(ponit);

        Moveable moveable = new Moveable(3f,4f,5f,6f);
        System.out.println(moveable);

        moveable.move();
        System.out.println(moveable);
    }
}
