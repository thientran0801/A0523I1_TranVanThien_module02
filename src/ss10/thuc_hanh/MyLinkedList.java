package ss10.thuc_hanh;

import java.util.LinkedList;

public class MyLinkedList {
private Node head;
private int numbNodes = 0;

public MyLinkedList(Object data) {
    this.head = new Node(data);
}

public void add(int index, Object data) {
    Node temp = head;
    Node holder;

    for (int i = 0; i < index -1 && temp.next != null; i++) {
        temp = temp.next;
    }
    holder = temp.next;
    temp.next =  new Node(data);
    temp.next.next = holder;
    this.numbNodes++;
}

public void addFirst(Object data) {
    Node temp = head;
    head = new Node(data);
    head.next = temp;
    this.numbNodes++;
}

public Object get(int index) {
    Node temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }
    return temp;
}

public void printList()  {
    Node temp = head;
    while (temp!= null) {
        System.out.println(temp.data);
        temp = temp.next;
    }
}
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
}
