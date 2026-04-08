import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();

    void add(int num){
        q2.add(num);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q2;
        q2= q1;
        q1 = temp;
    }

    int remove(){
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return q1.poll();
    }
}
