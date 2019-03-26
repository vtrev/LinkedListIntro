package co.projectcodex.algorithms;

public class Node<T> {

    private final T value;
    private Node<T> next;

    public Node(T value){
        this.value = value;
    }

    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
//        System.out.println("Setting next node "+next.getValue());
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
