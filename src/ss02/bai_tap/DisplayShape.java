package ss02.bai_tap;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        int choice = 1;
        Scanner inputChoice = new Scanner(System.in);

        while (choice !=0) {
            System.out.println("Manu:");
            System.out.println("1. print the rectangle");
            System.out.println("2. Print the square triangle at 4 different angle: top-left, top-right, botton-left, botton-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = inputChoice.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle botton-left: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("Draw the square triangle botton-right: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = i; j < 4 ; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("Draw the square triangle top-left: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("Draw the square triangle top-right: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = i; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = i; j < 4 ; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j <= 2*i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}
