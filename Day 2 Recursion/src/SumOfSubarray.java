import java.util.Scanner;

import static java.lang.System.in;

public class SumOfSubarray {

    private static void findSumOfSubarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
            }
            System.out.println(currentSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findSumOfSubarray(arr);
    }
}