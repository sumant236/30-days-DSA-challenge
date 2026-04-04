public class CircularQueue {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;

    CircularQueue(int n) {
        size = n;
        arr = new int[n];
    }

    public void add(int num) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full!!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = num;
    }

    public int remove() {
        if (front == -1) {
            System.out.println("Queue is empty!!");
            return -1;
        }

        int elem = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return elem;
    }
}
