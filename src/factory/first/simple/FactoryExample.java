package factory.first.simple;

import factory.first.Animal;

// Usage
public class FactoryExample {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");
        System.out.println(dog.speak());  // Output: Woof

        Animal cat = factory.createAnimal("cat");
        System.out.println(cat.speak());  // Output: Meow
    }
}

