import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;

public class LargestRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) leftSmaller[i]=-1;
            else leftSmaller[i] = stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = n-1; i >= 0; i--) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) rightSmaller[i]=n;
            else rightSmaller[i] = stack.peek();
            stack.push(i);
        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int width = rightSmaller[i] - leftSmaller[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea);
    }
}
