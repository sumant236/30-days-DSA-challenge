import java.util.Scanner;

import static java.lang.System.in;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i =0;
        int j = 1;
        while(j<n){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
