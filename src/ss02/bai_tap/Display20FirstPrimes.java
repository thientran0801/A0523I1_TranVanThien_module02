package ss02.bai_tap;

public class Display20FirstPrimes {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        System.out.println("Show first 20 primes: ");
        while (count <20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(n+", ");
                count++;
            }
            n++;
        }
    }
}
