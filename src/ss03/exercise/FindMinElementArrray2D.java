package ss03.exercise;

import java.util.Scanner;

public class FindMinElementArrray2D {
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
        System.out.printf("%-20s%s", "Element in the array: ", "");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }

        int min = array2D[0][0];
        int rowMin = 0;
        int columnMin = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array2D[i][j] < min) {
                    min = array2D[i][j];
                    rowMin = i;
                    columnMin = j;
                }
            }
        }

        System.out.println("The smallest element of the array2d is " + min + " in row " + (rowMin + 1)+ ", column " + (columnMin + 1));
    }

}
