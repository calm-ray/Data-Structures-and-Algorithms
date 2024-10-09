import java.util.Scanner;

public class Q4_PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        printPrimeInRange(start, end);
    }

    private static void printPrimeInRange(int start, int end) {
        for(int i=start; i<=end; i++) {
            int count = 1;
            for(int j=2; j<=i; j++) {
                if(i%j == 0)
                    count++;
            }
            if(count == 2)
                System.out.print(i+" ");
        }
    }
}
