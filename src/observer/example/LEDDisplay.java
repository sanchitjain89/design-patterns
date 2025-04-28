package observer.example;

// Concrete Observer 2: LED Display
public class LEDDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("LED Display: Temperature changed to " + temperature + "°C");
    }
}
