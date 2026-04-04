import java.util.Scanner;

public class FibonacciSeries {

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static void fibonacciBruteForce(int n ){
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
//        for (int i = 0; i < n; i++) {
//            int next = a + b;
//            a = b;
//            b = next;
//        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        fibonacciBruteForce(n);
    }
}
