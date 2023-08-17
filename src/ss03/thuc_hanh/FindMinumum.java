package ss03.thuc_hanh;

import java.util.Scanner;

public class FindMinumum {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        size = scanner.nextInt();
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i +1) +":");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }

        System.out.println();
//        int minInArray = array[0];
//        int indexOfmin = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]<minInArray){
//                minInArray = array[i];
//                indexOfmin = i;
//            }
//        }
        System.out.println("The value minimun of array is: "+ array[indexMin(array)]+ " at position "+(indexMin(array) +1));
    }
    public static int indexMin(int[] array) {
        int  indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]){
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
