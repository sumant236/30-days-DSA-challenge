// Number of ways to reach the target

import java.util.Scanner;

import static java.lang.System.in;

public class NumberOfSteps {
    private static int numberOfWays(int n){
        if(n <= 1){
            return n;
        }
        return numberOfWays(n-1)+numberOfWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        System.out.println(numberOfWays(n));
    }
}