package ss02.thuc_hanh;

import java.util.Scanner;

public class greatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a ==0 || b == 0 ) {
            System.out.println("No greatest common factor...");
        }
        while (a!=b) {
            if (a>b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor is: "+a);
    }
}
