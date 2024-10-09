import java.util.Scanner;

public class Q6_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // System.out.println(countDigitsBf(n));
        System.out.println(countDigits(n));
    }

    private static int countDigitsBf(int n) {
        int count = 0;
        while(n != 0) {
            count += 1;
            n = n / 10;
        }

        return count;
    }

    private static int countDigits(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }
}
