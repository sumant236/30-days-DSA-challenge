import java.util.Scanner;

public class Implementations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        QueueUsingStacks stack = new QueueUsingStacks();
//        StackUsingQueues queue = new StackUsingQueues();

        for (int i = 0; i < n; i++) {
            stack.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            System.out.print(stack.remove() + " ");
        }
    }
}
