package ss10.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEDAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEDAULT_CAPACITY];
    }
    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity cannot be negative!");
        }
        elements = new Object[capacity];
    }

    private void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, Math.max(elements.length*2, minCapacity));
    }

    public void add(int index, E element) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        E removedElement = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index-1);
        elements[size-1] = null;
        size--;
        return removedElement;
    }

    public int size() {
        return this.size;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element == null ? elements[i] == null : elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E element) {
        return indexOf(element)>=0;
    }

    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size] = element;
        size++;
        return true;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        return (E) elements[index];
    }

//    public MyList<E> clone() {
//        try {
//            MyList<E> cloneList = (MyList<E>) super.clone();
//            cloneList.elements = Arrays.copyOf(elements, size);
//            return cloneList;
//        } catch (CloneNotSupportedException e) {
//            throw new InternalError(e);
//        }
//    }
}



