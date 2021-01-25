package abstract_class_and_interface.thuc_hanh.class_animal_interface;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
