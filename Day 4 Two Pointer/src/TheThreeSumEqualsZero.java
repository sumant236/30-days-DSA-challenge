import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class TheThreeSumEqualsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i - 1] == arr[i]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[left] + arr[right] + arr[i];
                if (sum == 0) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
