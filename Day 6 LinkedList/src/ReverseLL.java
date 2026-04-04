import java.util.Scanner;

import static java.lang.System.in;

public class ReverseLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i <n; i++) {
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        Node prev = null;
        Node curr = head;
        Node forward = null;

        while(curr!=null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        Node temp = prev;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print( "null");
    }
}
