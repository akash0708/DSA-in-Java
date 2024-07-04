import java.util.Arrays;
import java.util.Scanner;

public class seiveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // initialize count and array of booleans
        int count = 0;
        boolean primes[] = new boolean[n + 1];

        // assume all the numbers are prime initially
        Arrays.fill(primes, true);

        // sieve of Eratosthenes
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
                for (int j = i * 2; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }
        System.out.println(count);
    }
}
