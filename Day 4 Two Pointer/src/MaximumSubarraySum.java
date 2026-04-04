import java.util.Scanner;

import static java.lang.System.in;

class MaximumSubarraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}