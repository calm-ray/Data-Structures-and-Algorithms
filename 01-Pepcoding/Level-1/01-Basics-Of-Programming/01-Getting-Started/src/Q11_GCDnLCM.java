import java.util.Scanner;

public class Q11_GCDnLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    private static int gcd(int a, int b) {
        while(a != 0) {
            int rem = b % a;
            b = a;
            a = rem;
        }

        return b;
    }

    private static int lcm(int a, int b) {
        return (a*b) / gcd(a,b);
    }
}
