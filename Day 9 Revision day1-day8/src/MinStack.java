import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int num) {
        mainStack.push(num);
        if (minStack.isEmpty() || num <= minStack.peek()) {
            minStack.push(num);
        }
    }

    int pop() {
        int elem = mainStack.pop();
        if(elem == minStack.peek()){
            minStack.pop();
        }
        return elem;
    }

    int getMin() {
        return minStack.peek();
    }
}
