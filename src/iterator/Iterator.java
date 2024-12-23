package iterator;

// Iterator interface
interface Iterator<T> {
    boolean hasNext();

    T next();

    void reset(); // Optional but useful
}
