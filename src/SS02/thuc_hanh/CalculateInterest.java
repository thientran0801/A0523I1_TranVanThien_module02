package SS02.thuc_hanh;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money, interestRate;
        int month;
        System.out.println("Enter loan amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual nterest rate in percentage: ");
        interestRate = sc.nextDouble();

        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest += money*(interestRate/12);
        }
        System.out.println("Total of interest is: "+ totalInterest);
    }
}
