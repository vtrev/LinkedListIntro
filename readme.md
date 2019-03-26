# Linked Lists

A Linked List is a way that you can create your own list Data Structure.

A Linked List consist out of a collection of Nodes. Each Node having a value and a reference to the next Node.

A typical LinkedList Node looks like this:

```java
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
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
```

It has two getters:

* `getValue` - to get the current Node's value
* `getNext` - to get the Node following this Node

It has one setter:

* `setNext` - to set the reference to the Node following the current Node.

## Using it

Use a Node to create a Linked List like this:

```java
Node<String> startNode = new Node<String>("Apple");
Node<String> pear = new Node<String>("Pear");
Node<String> banana = new Node<String>("Banana");
Node<String> orange = new Node<String>("Orange");

startNode.setNext(pear);
pear.setNext(banana);
banana.setNext(orange);

```

You can now loop over the collection Node using a `while` loop until this current Node's next Node is null then you reached the end of the Linked List.

This is the basic building blocks of creating your own List Data Structure.

## Try it

Run the JUnit tests in this project using maven.

```
mvn test
```

Fix all the failing tests in:

* BasicLinkedListNodeTest
* BasicLinkedListTest

To learn more about Linked Lists.

## Learn more

Once done with the above and you want another challenge:

* Fix the failing tests in `EditLinkListNodesTest`
* Implement the `EditableLinkedList` interface in `BasicLinkedList`

  






