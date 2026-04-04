import java.util.Scanner;
import static java.lang.System.in;

public class PalindromeLL {
    private static boolean checkPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = head;
        Node reversed = reverseLL(slow);
        while(reversed != null){
            if(reversed.data != temp.data){
                return false;
            }
            reversed = reversed.next;
            temp = temp.next;
        }
        return true;
    }

    private static Node reverseLL(Node slow) {
        Node prev = null;
        Node curr = slow;
        Node forward = null;

        while(curr!=null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());

            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        System.out.println(checkPalindrome(head));
    }
}