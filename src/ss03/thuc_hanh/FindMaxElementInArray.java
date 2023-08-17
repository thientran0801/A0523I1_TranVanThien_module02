package ss03.thuc_hanh;

import java.util.Scanner;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size>20)
                System.out.println("Size should not exceed 20.");
        }while (size >20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }

            System.out.printf("%-20s%s", "Element in array: ", "" );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
        System.out.println();
        int maxInArray = array[0];
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxInArray ){
                maxInArray = array[i];
                indexOfMax = i;

            }
        }

        System.out.print("The largest value in the list is "+ maxInArray+" , at position: "+ indexOfMax);
    }
}
