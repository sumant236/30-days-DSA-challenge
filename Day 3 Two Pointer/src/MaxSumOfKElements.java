import java.util.Scanner;

import static java.lang.System.in;

public class MaxSumOfKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];
            if(maxSum < sum){
                maxSum= sum;
            }
        }

        System.out.println(maxSum);
    }
}
