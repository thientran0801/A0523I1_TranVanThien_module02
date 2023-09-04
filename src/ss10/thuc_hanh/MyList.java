package ss10.thuc_hanh;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public  MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensurecapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensurecapa();
        }
        elements [size++] = e;
    }

    public E get(int index) {
        if (index <0 || index >=size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        }
        return (E) elements[index];
    }
}
