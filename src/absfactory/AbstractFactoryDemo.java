package absfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();

        factory = new MacOSFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.render();;
        checkbox.render();
    }

}
