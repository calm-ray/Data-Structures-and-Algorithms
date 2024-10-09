import java.util.Scanner;

public class Q7_DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noOfDigits = countDigits(n);

        digitsOfNumber(n, noOfDigits);
    }

    private static int countDigits(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    private static void digitsOfNumber(int n, int noOfDigits) {
        int multiplier = (int) Math.pow(10, noOfDigits-1);

        while(n != 0) {
            int digit = n / multiplier; //make it /
            System.out.println(digit);
            n %= multiplier;
            multiplier /= 10;
        }
    }
}
