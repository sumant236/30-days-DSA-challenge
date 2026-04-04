import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;

//Maan le 7 din ka stock price hai: [100, 80, 60, 70, 60, 75, 85]
//Tujhe batana hai har din ka "Span". Span ka matlab—aaj se piche kitne lagatar (consecutive) dinon tak price aaj se kam ya barabar tha?
public class StockSpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[n];

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = i + 1;
            } else {
                res[i] = i - stack.peek();
            }
            stack.push(i);
        }

        for(int num: res){
            System.out.print(num + " ");
        }
    }
}
