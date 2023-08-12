package SS02.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int numberCheck = sc.nextInt();

        if (numberCheck<2){
            System.out.println(numberCheck + "is not a prime");
        }else {
            int i = 2;
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(numberCheck) ; j++) {
                if (numberCheck%j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(numberCheck + " is a prime");
            }else {
                System.out.println(numberCheck + " is not a prime");
            }
        }

    }
}
