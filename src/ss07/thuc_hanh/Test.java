package ss07.thuc_hanh;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();

        for (Animal animal: animals) {
            System.out.println(animal.makeSoud());

            if (animal instanceof Chicken) {
                Edible chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }


    }
}
