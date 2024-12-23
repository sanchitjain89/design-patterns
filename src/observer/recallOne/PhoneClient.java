package observer.recallOne;

public class PhoneClient implements Observer{

    @Override
    public void notification() {
        System.out.println("Send push notification");
    }
}
