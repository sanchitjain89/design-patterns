package decorator;

// Demonstration
public class DecoratorDemo {
    public static void main(String[] args) {
        // Basic coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " Cost: $" + simpleCoffee.getCost());

        // Coffee with milk
        Coffee milkCoffee = new Milk(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.getCost());

        // Coffee with milk and sugar
        Coffee milkSugarCoffee = new Sugar(new Milk(simpleCoffee));
        System.out.println(milkSugarCoffee.getDescription() + " Cost: $" + milkSugarCoffee.getCost());
    }
}