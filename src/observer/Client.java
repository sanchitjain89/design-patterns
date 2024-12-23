package observer;

public interface Client {

    public void registerProducer(Producer producer);

    public void removeProducer(Producer producer);

    public void notifyAllProducers();

}
