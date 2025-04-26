package absfactory;

// Client Code
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory(); // Switch to MacOSFactory if needed

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();     // Rendering Windows Button
        checkbox.render();   // Rendering Windows Checkbox
    }
}