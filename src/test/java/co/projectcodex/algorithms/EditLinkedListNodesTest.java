package co.projectcodex.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditLinkedListNodesTest {


    @Test
    public void shouldSwapFirstNodeWithSecondNode(){

        Node<String> apple = new Node<String>("Apple");
        Node<String> pear = new Node<String>("Pear");
        Node<String> banana = new Node<String>("Banana");
        Node<String> orange = new Node<String>("Orange");

        apple.setNext(pear);
        pear.setNext(banana);
        banana.setNext(orange);

        Node<String> first = apple;

        // swap the first and the second node

        assertEquals("Pear", first.getValue());
        assertEquals("Apple", first.getNext().getValue());

    }

    @Test
    public void shouldSwapFirstNodeAndLastNode(){

        Node<String> apple = new Node<String>("Apple");
        Node<String> pear = new Node<String>("Pear");
        Node<String> banana = new Node<String>("Banana");
        Node<String> orange = new Node<String>("Orange");

        Node<String> first = apple;

        // swap the first and the last node

        assertEquals("Orange", first.getValue());
        assertEquals("Apple", first
                .getNext()
                .getNext()
                .getNext()
                .getValue());

    }

}
