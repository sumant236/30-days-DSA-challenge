import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class TwoSumTwoPointerApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        if (left > right) System.out.println("Pair not found!!");
        else System.out.println(arr[left] + " " + arr[right]);
    }
}
