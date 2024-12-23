package factory.first.method;

import factory.first.Animal;

// Usage
public class FactoryMethodExample {

    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        System.out.println(dog.speak());  // Output: Woof

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        System.out.println(cat.speak());  // Output: Meow
    }

}
