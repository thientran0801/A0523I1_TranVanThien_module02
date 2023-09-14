package ss11.bai_tap;

import javax.xml.soap.Node;

public class ImplementQueue<E> {
    private Node front;
    private Node rear;
    public ImplementQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return this.front == null && this.rear == null;
    }

    public void enQueue(E data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            rear.link = front;
        }else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        if (front == rear) {
            front = null;
            rear = null;
        }else {
            front = front.link;
            rear.link = front;
        }

    }
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        Node current = front;
        System.out.print("[ ");
        do {
            if (current == rear) {
                System.out.print(current.getData() + " ]");
                break;
            }
            System.out.print(current.getData() + ", ");
            current = current.link;
        }while (current != front);
        System.out.println();
    }
    private class Node {
        private E data;
        private Node link;

        public Node(E data) {
            this.data = data;
            this.link = null;
        }
        public E getData() {
            return this.data;
        }
    }

    public static void main(String[] args) {
        ImplementQueue<String> queueList = new ImplementQueue<>();
        queueList.enQueue("one");
        queueList.enQueue("two");
        queueList.enQueue("three");
        queueList.enQueue("four");
        queueList.enQueue("five");
        queueList.enQueue("six");
        queueList.enQueue("seven");
        queueList.enQueue("eight");
        queueList.enQueue("nine");
        queueList.enQueue("ten");

        System.out.println("Before dequeue: ");
        queueList.displayQueue();

        queueList.deQueue();
        queueList.deQueue();
        queueList.deQueue();
        System.out.println("After dequeue: ");
        queueList.displayQueue();
    }
}

