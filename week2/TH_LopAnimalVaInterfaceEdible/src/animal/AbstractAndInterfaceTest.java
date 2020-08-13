package animal;

import edible.Apple;
import edible.Edible;
import edible.Fruit;
import edible.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].makeSound());
            if (animals[i] instanceof Chicken){
                Edible edibler = (Chicken) animals[i];
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (int i = 0; i < fruit.length; i++){
            System.out.println(fruit[i].howToEat());
        }
    }

}
