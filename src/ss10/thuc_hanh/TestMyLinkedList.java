package ss10.thuc_hanh;

import ss10.bai_tap.MyList;

import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
ll.printList();
        System.out.println("all  element");


        ll.add(4,9);
        ll.add(2,9);
        ll.printList();

        LinkedList linkedList = new LinkedList();
    }
}
