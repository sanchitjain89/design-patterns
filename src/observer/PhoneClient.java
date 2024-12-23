package observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneClient implements Client {

    List<Producer> clientList = new ArrayList<>();

    @Override
    public void registerProducer(Producer producer) {
        clientList.add(producer);

    }

    @Override
    public void removeProducer(Producer producer) {
        clientList.remove(producer);
    }

    @Override
    public void notifyAllProducers() {

        for (Producer p : clientList){
            p.update();
        }
    }
}

/*
Strategy Pattern

Very common in interviews
Often asked with examples like:

Payment processing systems
Sorting algorithms
Navigation/routing strategies




Chain of Responsibility

Frequently asked
Common examples include:

Logging frameworks
Exception handling
Request processing pipelines




Command Pattern

Popular in interviews
Often discussed with examples like:

Undo/Redo operations
Remote control systems
Queue management
Transaction management




Iterator Pattern

Common in collection-focused interviews
Usually discussed with:

Custom collection implementations
Database result set iteration
Tree traversal algorithms
*/
