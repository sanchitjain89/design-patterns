package observer.recallOne;

public class WebClient implements Observer{

    @Override
    public void notification() {
        System.out.println("Send web notification!");
    }
}
