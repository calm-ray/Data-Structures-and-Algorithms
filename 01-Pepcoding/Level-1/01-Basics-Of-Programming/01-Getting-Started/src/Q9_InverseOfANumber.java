import java.util.Scanner;

public class Q9_InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(inverseOfANumber(n));
    }

    private static int inverseOfANumber(int n) {
        int power = 1;
        int inverted = 0;
        while(n != 0) {
            int digit = n % 10;
            n = n / 10;
            inverted += (int) (power * Math.pow(10, digit - 1));
            power++;
        }

        return inverted;
    }
}
