import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 1) // base case
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int factorial = fact(n);
        System.out.println(factorial);
    }
}
