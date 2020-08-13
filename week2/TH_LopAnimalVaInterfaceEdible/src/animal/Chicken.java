package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: o o o";
    }

    @Override
    public String howToEat() {
        return "nho long xong roi luoc hoac nuong hoac quay";
    }
}
