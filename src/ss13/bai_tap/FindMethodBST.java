package ss13.bai_tap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindMethodBST {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("How many element do you want to add to the list: ");
        int numElement = scanner.nextInt();
        int[] arrayList = new int[numElement];
        for (int i = 0; i < numElement; i++) {
            System.out.println("Enter element " + (i+1) + " :");
            arrayList[i] = scanner.nextInt();
        }
        for (int number : arrayList) {
            System.out.print(number + " ");
        }
        Arrays.sort(arrayList);

        System.out.println();
        for (int number : arrayList) {
            System.out.print(number + " ");
        }
        System.out.println("\nWhich element do you want to search: ");
        int value = scanner.nextInt();
        int result = binarySearch(arrayList, 0, arrayList.length-1, value);
        if (result != -1) {
            System.out.println("Element " + value + " is at position " + (result+1) + " in the list");
        }else {
            System.out.println("Not found!");
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int upperBound = right;
        int lowerBound = left;

        while (left < right) {
            int mid = (int) Math.floor((upperBound + lowerBound)/2);
            if (array[mid] == value) {
                return mid;
            }else if (array[mid] > value) {
                upperBound = mid--;
            }else {
                lowerBound = mid++;
            }
        }
        return -1;
    }
}
