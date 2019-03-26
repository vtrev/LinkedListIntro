package co.projectcodex.algorithms;

public interface LinkedList<T> {
    void add(T value);

    int size();

    T first();

    T last();

    T next();

    T getAt(int index);

    void reset();
}
