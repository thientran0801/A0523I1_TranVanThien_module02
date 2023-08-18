package ss03.exercise;

import java.util.Scanner;

public class SumOfDiagonalsMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and column for the square matrix: ");
        int rowCol = scanner.nextInt();
        int[][] array2D = new int[rowCol][rowCol];
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < rowCol; j++) {
                System.out.println("Enter the element in row "+ (i+1) + " column "+(j+1)+":");
                array2D[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("%-20s%s", "Element in the square matrix: ", "");
        System.out.println();
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < rowCol; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < rowCol; j++) {
                if (i == j){
                    sum += array2D[i][j];
                }
            }
        }
        System.out.println("Sum of the element of the main diagonal of the square matrix is: " + sum);
    }
}
