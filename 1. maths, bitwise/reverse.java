import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();

        int reverse = 0;

        while (n > 0) {
            int d = n % 10;
            reverse = reverse * 10 + d;
            n /= 10;
        }

        System.out.println(reverse);
    }
}
