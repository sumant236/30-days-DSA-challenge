import java.util.Scanner;

import static java.lang.System.in;

public class HasCycleLL {
    private static boolean hasCycle(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps

            if (slow == fast) {      // Race track par mil gaye!
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

//        to create cycle
//        if (tail != null) {
//            tail.next = head;
//        }

        System.out.println(head != null ? hasCycle(head) : "null");
    }
}
