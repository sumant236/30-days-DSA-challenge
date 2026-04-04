import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

// an integer which came more then half times of the length of the array
public class MooreAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        O(nlogn)
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

//        O(n);
        int count = 0;
        int candidate = 0;
        for (int num: arr) {
            if(count == 0){
                candidate = num;
            }
            if(num==candidate){
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }
}
