package factory.first.method;

import factory.first.Animal;
import factory.first.Cat;

public class CatFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
