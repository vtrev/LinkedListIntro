package co.projectcodex.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicLinkedListNodeTest {

    @Test
    public void shouldBeAbleToFindTheLastNode() {

        Node<String> apple = new Node<String>("Apple");
        Node<String> pear = new Node<String>("Pear");
        Node<String> banana = new Node<String>("Banana");
        Node<String> orange = new Node<String>("Orange");

        apple.setNext(pear);
        pear.setNext(banana);
        banana.setNext(orange);

        Node<String> lastNode = apple;

        // write code here to find the last Node

        assertEquals("Orange", lastNode.getValue());
    }

    @Test
    public void shouldBeAbleToSumAllMultiplesOf2Nodes() {

        Node<Integer> number1 = new Node<Integer>(7);
        Node<Integer> number2 = new Node<Integer>(4);
        Node<Integer> number3 = new Node<Integer>(13);
        Node<Integer> number4 = new Node<Integer>(29);
        Node<Integer> number5 = new Node<Integer>(36);


        number1.setNext(number2);
        number2.setNext(number3);
        number3.setNext(number4);
        number4.setNext(number5);

        Node<Integer> currentNode = number1;
        int total = 0;

        // sum all the value which is a multiple of 2 into total

        assertEquals(40, total);
    }

    @Test
    public void shouldBeAbleToSumAllNodes() {

        Node<Integer> number1 = new Node<Integer>(7);
        Node<Integer> number2 = new Node<Integer>(4);
        Node<Integer> number3 = new Node<Integer>(13);
        Node<Integer> number4 = new Node<Integer>(29);
        Node<Integer> number5 = new Node<Integer>(36);


        number1.setNext(number2);
        number2.setNext(number3);
        number3.setNext(number4);
        number4.setNext(number5);

        Node<Integer> currentNode = number1;
        int total = 0;

        // sum each nodes value into total

        assertEquals(89, total);
    }

}
