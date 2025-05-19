package decorator;

// Client code
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();

        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

        myCoffee = new MilkDecorator(myCoffee);
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());
    }
}