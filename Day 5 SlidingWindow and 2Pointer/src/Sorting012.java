import java.util.Scanner;

import static java.lang.System.in;

public class Sorting012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid]==0){
                swapArr(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                swapArr(arr, mid, high);
                high--;
            } else {
                mid++;
            }

        }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }

    private static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
