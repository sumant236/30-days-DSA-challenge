import java.util.Scanner;

import static java.lang.System.in;

public class SmallestSubArrayWithSumS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int S = sc.nextInt();

        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while(sum>=S){
                sum -= arr[start];
                minLength = Math.min(end-start+1, minLength);
                start++;
            }
        }
        System.out.println(minLength);
    }
}
