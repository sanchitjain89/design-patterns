package factory.first.simple;

import factory.first.Animal;
import factory.first.Cat;
import factory.first.Dog;

// Factory class
class AnimalFactory {

    public Animal createAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        throw new IllegalArgumentException("Unknown animal type");
    }

}