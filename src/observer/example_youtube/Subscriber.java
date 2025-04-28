package observer.example_youtube;

// Concrete Observer: Subscriber
class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + ": Received notification for new video - " + videoTitle);
    }
}

