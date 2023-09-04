package ss10.thuc_hanh;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("Element 1: " + listInteger.get(0));
        System.out.println("Element 2: " + listInteger.get(1));
        System.out.println("Element 3: " + listInteger.get(2));
        System.out.println("Element 4: " + listInteger.get(3));
        System.out.println("Element 5: " + listInteger.get(4));

//        listInteger.get(6);
//        System.out.println("Element 6: " + listInteger.get(6));

        //TH2
        listInteger.get(-1);
        System.out.println("Element -1: " + listInteger.get(-1));
        System.out.println();
    }
}
