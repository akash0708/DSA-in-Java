import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n = 5000000;

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                count++;
        }
        System.out.println(count);
    }

    static boolean isPrime(int x) {
        for (int i = 2; (i * i) <= x; i++) {
            if (x % i == 0)
                return false;
        }

        return true;
    }
}
