package factory.first.method;

import factory.first.Animal;
import factory.first.Dog;

// Concrete Creators
class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

