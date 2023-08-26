package ss03.bai_tap;

import java.util.Scanner;

public class FindMaxArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrix: ");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns for the matrix: ");
        int col = scanner.nextInt();

        int[][] array2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element in row "+ (i+1) + " column "+(j+1)+":");
                array2D[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("%-20s%s", "Element in the matrix: ", "");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }

        int max = array2D[0][0];
        int rowMax = 0;
        int columnMax = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                    rowMax = i;
                    columnMax = j;
                }
            }
        }

        System.out.println("The largest element of the matrix is " + max + " in row " + (rowMax + 1)+ ", column " + (columnMax + 1));
    }
}
