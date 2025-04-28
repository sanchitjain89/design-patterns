package observer.example_youtube;

// Subject interface
interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String videoTitle);

}

