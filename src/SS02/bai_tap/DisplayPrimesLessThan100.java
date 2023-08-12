package SS02.bai_tap;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        System.out.println("Display Primes less than 100: ");
        int n = 2;
         while (n < 100) {
             boolean isPrime = true;
             for (int i = 2; i <= Math.sqrt(n); i++) {
                 if (n%i == 0) {
                     isPrime = false;
                 }
             }
             if (isPrime) {
                 System.out.print(n+ ", ");
             }
             n++;
         }
    }
}
