package observer.recallOne;

import java.util.ArrayList;
import java.util.List;

public class ObserverList {

    public List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o){
        observers.add(o);
    }

    public void triggerNotification(){
        for (Observer o : observers){
            o.notification();
        }
    }

}
