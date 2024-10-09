import java.util.Scanner;

public class Q5_FibonacciTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFiboInRange(n);
    }

    private static void printFiboInRange(int n) {
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);
        for(int i=1; i<=n-2; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
