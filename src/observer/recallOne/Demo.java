package observer.recallOne;

public class Demo {

    public static void main(String[] args) {

        PhoneClient pc = new PhoneClient();
        WebClient wc = new WebClient();

        ObserverList observerList = new ObserverList();
        observerList.subscribe(pc);
        observerList.subscribe(wc);

        observerList.triggerNotification();


    }

}
