package co.projectcodex.algorithms;

public class BasicLinkedList<T> implements LinkedList<T> {

    private Node currentNode;
    private Node firstNode;
    public void add(T value) {
        if (this.firstNode == null) {
            this.firstNode = new Node<T>(value);
            this.currentNode = firstNode;
            return;
        }   else {
            Node<T> tmpNode = new Node<>(value);
            currentNode.setNext(tmpNode);
            currentNode = tmpNode;
        }

    }

    public int size() {
        //System.out.println("First Node : "+this.firstNode.getValue());
        //System.out.println("Current Node : "+this.currentNode.getValue());
        int total = 0;
        if(firstNode == null)
            return total;
        while (true){
            if(firstNode.getNext() == null) {
                total = 1;
                break;
            }else {
                currentNode = firstNode.getNext();
            }
            System.out.println("Current Node : "+this.currentNode.getValue());

            if(currentNode.getNext() == null){
                total += 1;
                break;
            }else if(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }else {
                break;
            }


        }
        return total;
    }

    public T first() {
        return null;
    }

    public T last() {
        return null;

    }

    public T next() {
        return null;
    }

    public T getAt(int index) {

        return null;
    }

    public void reset() {

    }

}
