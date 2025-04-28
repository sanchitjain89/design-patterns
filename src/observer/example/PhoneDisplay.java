package observer.example;

// Concrete Observer 1: Phone Display
class PhoneDisplay implements Observer {

    private String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " Display: Temperature is now " + temperature + "°C");
    }
}

