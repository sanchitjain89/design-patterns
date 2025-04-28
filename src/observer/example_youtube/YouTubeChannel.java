package observer.example_youtube;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject: YouTube Channel
class YouTubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }

    // Simulates uploading a new video
    public void uploadVideo(String title) {
        System.out.println("YouTubeChannel: Uploaded a new video - " + title);
        notifyObservers(title);
    }
}
