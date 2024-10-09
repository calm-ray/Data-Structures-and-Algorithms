import java.util.Scanner;

public class Q3_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();

            if(isPrime(n))
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
    }

    private static boolean isPrime(int n) {
        int count = 1;
        for(int i=2; i<=n; i++) {
            if(n%i == 0)
                count++;
        }

        return count == 2;
    }
}
