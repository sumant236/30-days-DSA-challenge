import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = n-1; i >= 0; i--) {
            // 1. Jab tak stack mein chhote log hain, unhe nikaalte raho
            // (Notice: isEmpty() check while ke andar hona chahiye)
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // 2. Agar stack khali ho gaya toh koi bada nahi mila, else top wala hi NGE hai
            res[i] = stack.isEmpty() ? -1 : stack.peek();

            // 3. Khud ko stack mein push karo (taki piche waalon ke liye tum NGE ban sako)
            stack.push(arr[i]);
        }

        for (int num: res){
            System.out.print(num + " ");
        }
    }
}
