package ss03.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
        System.out.println();
        System.out.println("Enter element to be additional: ");
        int elementAdd = sc.nextInt();
        System.out.println("Enter position to be additional: ");
        int indexAdd = sc.nextInt() -1;

        if (indexAdd <0 || indexAdd >array.length-1){
            System.out.println("Unable to insert element into array");
            return;
        }
        for (int i = array.length - 1; i > indexAdd; i--) {
            array[i] = array[i-1];
        }
        array[indexAdd] = elementAdd;
        System.out.printf("%-20s%s", "Element in array after additional: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
    }
}
