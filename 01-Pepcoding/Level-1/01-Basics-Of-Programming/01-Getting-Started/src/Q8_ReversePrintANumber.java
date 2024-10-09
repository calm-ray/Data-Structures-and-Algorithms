import java.util.Scanner;

public class Q8_ReversePrintANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printInReverse(n);
    }

    private static void printInReverse(int n) {
        while(n != 0) {
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }
    }
}
