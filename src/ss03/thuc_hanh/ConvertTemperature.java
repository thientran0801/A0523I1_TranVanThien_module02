package ss03.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Fahrenheit to Celsius. ");
            System.out.println("2. Celsius to Fahrenheit. ");
            System.out.println("3. Exit. ");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Convert from fahrenheit to celsius: ");
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit+ " (F) equivalent to "+ fahrenheitToCelsius(fahrenheit)+" (C)");
                    break;
                case 2:
                    System.out.println("Convert from celsius to fahrenheit: ");
                    System.out.println("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println(celsius+ " (C) equivalent to "+ celsiusToFahrenheit(celsius)+" (F)");
                    break;
                default:
                    System.out.println("No choice!");
            }
        }while (choice != 0);
    }

    public static double celsiusToFahrenheit(double ceisius){
        double fahrenheit = 9/5*ceisius+32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = fahrenheit*5/9 - 32;
        return celsius;
    }

}
