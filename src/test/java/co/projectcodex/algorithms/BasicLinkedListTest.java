package co.projectcodex.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicLinkedListTest {

    @Test
    public void shouldBeAbleToAddToLinkedList() {

        BasicLinkedList<String> linkedList = new BasicLinkedList<String>();
        linkedList.add("Apple");

        assertEquals(1, linkedList.size());

        linkedList.add("Pear");
        linkedList.add("Banana");

        assertEquals(3, linkedList.size());

    }

    @Test
    public void shouldBeAbleToAddToGetFirst() {

        BasicLinkedList<String> linkedList = new BasicLinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Pear");
        linkedList.add("Banana");

        assertEquals("Apple", linkedList.first());

    }

    @Test
    public void shouldBeAbleToAddToGetLast() {

        BasicLinkedList<String> linkedList = new BasicLinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Pear");
        linkedList.add("Banana");

        assertEquals("Banana", linkedList.last());

        linkedList = new BasicLinkedList<String>();
        linkedList.add("Pear");
        linkedList.add("Banana");
        linkedList.add("Mango");

        assertEquals("Mango", linkedList.last());

    }

    @Test
    public void shouldBeAbleToLoopUsingNext() {

        BasicLinkedList<String> linkedList = new BasicLinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Pear");
        linkedList.add("Banana");

        assertEquals("Apple", linkedList.next());
        linkedList.next();
        assertEquals("Banana", linkedList.next());
        assertEquals(null, linkedList.next());

    }

    @Test
    public void shouldBeAbleToLoopUsingNextWithEmptyList() {

        LinkedList<String> linkedList = new BasicLinkedList<String>();
        assertEquals(null, linkedList.next());

    }

    @Test
    public void shouldBeAbleToGetSizeOfEmptyList() {
        LinkedList<String> linkedList = new BasicLinkedList<String>();
        assertEquals(0, linkedList.size());
    }

    @Test
    public void shouldBeAbleToCallFirstOnEmptyList() {
        LinkedList<String> linkedList = new BasicLinkedList<String>();
        assertEquals(null, linkedList.first());
    }

    @Test
    public void shouldBeAbleToCallLastOnEmptyList() {
        LinkedList<String> linkedList = new BasicLinkedList<String>();
        assertEquals(null, linkedList.last());
    }

    @Test
    public void shouldBeAbleToResetNextLoop() {

        BasicLinkedList<String> linkedList = new BasicLinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Pear");
        linkedList.add("Banana");

        assertEquals("Apple", linkedList.next());
        assertEquals("Pear", linkedList.next());
        linkedList.reset();
        assertEquals("Apple", linkedList.next());

    }

    @Test
    public void shouldBeAbleToGetSecondItem() {

        BasicLinkedList<String> linkedList = new BasicLinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Pear");
        linkedList.add("Banana");

        assertEquals("Pear", linkedList.getAt(1));

    }

    @Test
    public void shouldBeAbleToGetFivePlaceItem() {

        BasicLinkedList<String> linkedList = new BasicLinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Pear");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Orange");
        linkedList.add("Guava");


        assertEquals("Orange", linkedList.getAt(4));

    }

}
