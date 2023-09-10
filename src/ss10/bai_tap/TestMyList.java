package ss10.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        myList.add(6);
        myList.add(3, 9);
        myList.remove(6);
        myList.remove(2);

        System.out.println("Element 0: " + myList.get(0));
        System.out.println("Element 1: " + myList.get(1));
        System.out.println("Element 2: " + myList.get(2));
        System.out.println("Element 3: " + myList.get(3));
        System.out.println("Element 4: " + myList.get(4));
//        System.out.println("Element 5: " + myList.get(5));
//        System.out.println("Element 6: " + myList.get(6));
//        System.out.println("Element 7: " + myList.get(7));

        System.out.println("Size: " + myList.size());
        System.out.println("List contains element 3 : " + myList.contains(3) );
        myList.clear();
        System.out.println(myList.size());
    }
}
