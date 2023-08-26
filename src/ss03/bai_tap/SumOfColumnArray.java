package ss03.bai_tap;

import java.util.Scanner;

public class SumOfColumnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the array: ");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns for the array: ");
        int col = scanner.nextInt();

        int[][] array2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element in row "+ (i+1) + " column "+(j+1)+":");
                array2D[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("%-20s%s", "Element in the array 2D: ", "");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Which column in the array do you want to sum ? ");
        int colSum = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += array2D[i][colSum-1];
        }

        System.out.println("Sum of element in column " + colSum + " is: " + sum);
    }
}
