package ss15.thuc_hanh;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static ArrayList<Integer> createRandom() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList list = ArrayExample.createRandom();
        System.out.println(list);
        System.out.println("Please, Enter an index for the element do you want to display: ");
        Scanner scanner = new Scanner(System.in);
        int indexDisplay = scanner.nextInt();

        try {
            System.out.println("Element at index " + indexDisplay + " is " + list.get(indexDisplay));
        }catch (IndexOutOfBoundsException e) {
            e.getMessage();
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("index out of bound !!!");
        }finally {
            System.out.println("Done !");
        }
    }
}