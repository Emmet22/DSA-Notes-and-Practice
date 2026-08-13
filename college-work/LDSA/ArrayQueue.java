package assignment1;

public class ArrayQueue implements Queue<Object> {
    private Object[] Q;

    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        // TASK 3.A.a
        Q = new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(Object x) {
        // TASK 3.A.b
        if (size == Q.length) {
            throw new RuntimeException("Queue overflow");
        } else {
            Q[rear] = x;
            rear = (rear + 1) % Q.length;
            size += 1;
        }
    }

    public Object dequeue() {
        // TASK 3.A.c
        if(size == 0) {
            throw new RuntimeException("Queue underflow");
        } else {
            Object item = Q[front];
            front = (front + 1) % Q.length;
            size -= 1;
            return item;
        }
    }

    public Object next() {
        // TASK 3.A.d
        if (size == 0) {
            throw new RuntimeException("Queue underflow");
        } else {
            return Q[front];
        }
    }

    public boolean empty() {
        // TASK 3.A.e
        boolean isEmpty = false;
        if (size == 0) {
            isEmpty = true;
        } else if (size > 0) {
            isEmpty = false;
        }
        return isEmpty;
    }

    public static void main(String[] args) {
        Queue<Object> test = new ArrayQueue(20);
        System.out.println(test.empty());
        for (int i=0; i<10; i++) {
            test.enqueue(i+100);
        }
        System.out.println(test.empty());
        System.out.println(test.next());
        for (int i=0; i<5; i++) {
            int x = (int)test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i=0; i<15; i++) {
            test.enqueue(i);
        }
        while (!test.empty()) {
            int x = (int)test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
