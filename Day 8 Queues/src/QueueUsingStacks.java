import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void add(int num){
        s1.add(num);
    }

    int remove(){
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) return -1;
        return s2.pop();
    }
}