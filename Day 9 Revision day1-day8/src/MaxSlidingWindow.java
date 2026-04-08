import java.util.*;

import static java.lang.System.in;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        ArrayList<Integer> res = new ArrayList<>();
        // Deque banaya jo INDICES store karega
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // STEP 1: Expire ho chuke logon ko Aage se nikalo
            // (Agar Deque ka sabse pehla index current window se bahar hai)
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // STEP 2: Chote logon ko Piche se bhagao
            // (Jab tak Deque ka aakhri element current element se chota hai)
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // STEP 3: Naye element ka Index piche daal do
            dq.offerLast(i);

            // STEP 4: Jab window poori ho jaye (size k), tabhi result likhna shuru karo
            if (i >= k - 1) {
                // Sabse aage wala index hamesha sabse bada hoga!
                res.add(arr[dq.peekFirst()]);
            }
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + ", ");
        }
    }
}
