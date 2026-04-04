import java.util.Scanner;

import static java.lang.System.in;

public class RemoveNthFromEnd {
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

        int K = sc.nextInt();

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < K; i++) {
            fast = fast.next;
        }

        if(fast==null){
            head = head.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
