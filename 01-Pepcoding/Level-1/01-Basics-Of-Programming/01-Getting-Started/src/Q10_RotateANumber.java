import java.util.Scanner;

public class Q10_RotateANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(rotateANumber(n, k));
    }

    private static int rotateANumber(int n, int k) {
        int noOfDigits = countDigits(n);

        if(k < 0)
            k = noOfDigits + k;

        k = k % noOfDigits;

        int divider = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, noOfDigits - k);

        int rem = n % divider;
        int quo = n / divider;

        int res = rem * multiplier + quo;
        return res;
    }

    private static int countDigits(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    private static int reverseNumber(int n) {
        int res = 0;
        while(n != 0) {
            int digit = n % 10;
            res = res * 10 + digit;
            n /= 10;
        }

        return res;
    }
}
