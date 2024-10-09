import java.util.Scanner;

public class Q13_PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));

        if(max == a)
            System.out.println(a*a == b*b + c*c);
        else if(max == b)
            System.out.println(b*b == a*a + c*c);
        else
            System.out.println(c*c == b*b + a*a);
    }
}
