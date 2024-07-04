import java.util.Scanner;

public class powerOfN {
    public static int recPowerOfN(int n, int x) {
        if (x == 1)
            return n;
        return n * recPowerOfN(n, x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int powOfN = recPowerOfN(x, n);

        System.out.println(powOfN);
    }
}
