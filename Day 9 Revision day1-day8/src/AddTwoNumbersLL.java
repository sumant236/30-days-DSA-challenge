import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.in;

public class AddTwoNumbersLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();

        ListNode l1 = null;
        ListNode temp = null;
        System.out.println("Enter the elements of the l1: ");
        for (int i = 0; i < n; i++) {
            ListNode newNode = new ListNode(sc.nextInt());

            if(l1 == null){
                l1 = newNode;
                l1.next = null;
                temp = l1;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        ListNode l2 = null;
        temp = null;
        System.out.println("Enter the elements of the l2: ");
        for (int i = 0; i < n; i++) {
            ListNode newNode = new ListNode(sc.nextInt());

            if(l2 == null){
                l2 = newNode;
                l2.next = null;
                temp = l2;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        int carry = 0;

        while(temp1!=null || temp2!=null || carry > 0){
            int sum = carry;

            if (temp1 != null) {
                sum = sum + temp1.data;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum = sum + temp2.data;
                temp2 = temp2.next;
            }

            int ans = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(ans);
            curr = curr.next;
        }

        printNode(result.next);
    }

    private static void printNode(ListNode result) {
        ListNode temp = result;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
