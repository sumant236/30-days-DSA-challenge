import java.util.Scanner;

import static java.lang.System.in;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;
        int mid = 0;

        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                mid++;
                low++;
            } else if(arr[mid] == 1){
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}