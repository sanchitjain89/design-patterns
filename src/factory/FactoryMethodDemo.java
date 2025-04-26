package factory;

// Client
public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}