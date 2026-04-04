import java.util.Scanner;

import static java.lang.System.in;

public class CycleDetection {
    private static int detectCycleNode(Node head) {
        if (head == null || head.next == null) return -1;

        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if(isCycle){
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }

        return -1;
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
        if (tail != null) {
            tail.next = head.next.next;
        }

        System.out.println(head != null ? detectCycleNode(head) : "null");
    }
}
