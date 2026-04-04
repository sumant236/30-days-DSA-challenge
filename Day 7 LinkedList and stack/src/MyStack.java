public class MyStack {
    int[] arr;
    int top;
    int size;

    MyStack(int s){
        size = s;
        top = -1;
        arr = new int[size];
    }

    public void push(int val){
        if(top == size-1){
            System.out.println("Stack Overflow!!");
            return;
        }
        top++;
        arr[top] = val;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow!! No elements in the stack");
        }
        int res = arr[top];
        top--;
        return res;
    }

    public int peek(){
        if(top == -1) return -1;
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

}
