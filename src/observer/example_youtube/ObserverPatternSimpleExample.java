package observer.example_youtube;

public class ObserverPatternSimpleExample {
    public static void main(String[] args) {
        // Create YouTube Channel (Subject)
        YouTubeChannel channel = new YouTubeChannel();

        // Create Subscribers (Observers)
        Observer subscriber1 = new Subscriber("Alice");
        Observer subscriber2 = new Subscriber("Bob");

        // Subscribe to the channel
        channel.addObserver(subscriber1);
        channel.addObserver(subscriber2);

        // Upload a video, which notifies subscribers
        channel.uploadVideo("Observer Pattern Explained!");

        // Unsubscribe Bob and upload another video
        channel.removeObserver(subscriber2);
        channel.uploadVideo("Strategy Pattern in Java!");
    }
}

