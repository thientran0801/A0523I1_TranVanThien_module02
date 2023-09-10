package ss10.bai_tap;

import javax.xml.ws.Holder;
import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numbNode = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numbNode++;
    }

    public int size() {
        return numbNode;
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        this.numbNode++;
    }

    public void addLast(E data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        this.numbNode++;
    }

    public void add(int index, E data) {
        if (index < 0 || index > numbNode) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == numbNode) {
            addLast(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        this.numbNode++;
    }

    private E removeFirst() {
        if (head == null) {
            return null;
        }
        E temp = (E) head.getData();
        head = head.next;
        numbNode--;
        return temp;
    }

    private E removeLast() {
        if (numbNode == 0) {
            return null;
        } else if (numbNode == 1) {
            return removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < numbNode - 2; i++) {
                temp = temp.next;
            }
            E holder = (E) temp.next.getData();
            temp.next = null;
            numbNode--;
            return holder;
        }
    }


    public boolean remove(Object element) {
        int indexRemove = indexOf((E) element);
        if (indexRemove == -1) {
            return false;
        } else if (indexRemove == 0) {
            head = head.next;
            numbNode--;
            return true;
        } else {
            Node temp = head;
            for (int i = 0; i < indexRemove - 1; i++) {
                temp = temp.next;
            }
            if (indexRemove == numbNode - 1) {
                temp.next = null;
            } else {
                temp.next = temp.next.next;
            }
            numbNode--;
            return true;
        }
    }

    public E removeByID(int indexRemove) {
        if (indexRemove < 0 || indexRemove > numbNode) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        if (indexRemove == 0) {
            return removeFirst();
        } else if (indexRemove == numbNode - 1) {
            return removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < indexRemove - 1; i++) {
                temp = temp.next;
            }
            E holder = (E) temp.next.getData();
            temp.next = temp.next.next;
            numbNode--;
            return holder;
        }
    }

    public int indexOf(E element) {
        if (head.getData().equals(element)) {
            return 0;
        } else {
            Node temp = head;
            for (int i = 1; i < numbNode; i++) {
                if (temp.next.getData().equals(element)) {
                    return i;
                }
                temp = temp.next;
            }
        }
        return -1;
    }

    public E getFirst() {
        if (head == null) {
            return null;
        }
        return (E) head.getData();
    }

    public E getLast() {
        if (numbNode <= 1) {
            return getFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < numbNode - 2; i++) {
                temp = temp.next;
            }
            return (E) temp.next.getData();
        }
    }

    public E get(int index) {
        if (index < 0 || index > numbNode) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        if (index == 0) {
            return getFirst();
        } else if (index == numbNode - 1) {
            return getLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            return (E) temp.next.getData();
        }
    }

    public void clear() {
        while (numbNode > 0) {
            removeFirst();
        }
    }

    public boolean contains(E o) {
        if (indexOf(o) == -1) {
            return false;
        } else return true;
    }

    private class Node<E> {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    public void printList() {
        Node currentNode = head;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public MyLinkedList<E> clone() {
        MyLinkedList linkedList = new MyLinkedList(null);
        Node temp = head;
        while (temp != null) {
            linkedList.addLast(temp.getData());
            temp = temp.next;
            return linkedList;
        }
        return null;
    }
}
