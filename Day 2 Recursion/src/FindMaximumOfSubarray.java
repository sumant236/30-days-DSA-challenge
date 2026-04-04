import java.util.Scanner;

import static java.lang.System.in;

public class FindMaximumOfSubarray {
    private static int findMaximum(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(maxSum < sum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaximum(arr));
    }
}
