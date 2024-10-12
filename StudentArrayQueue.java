package StackandQueueDemo;

public class StudentArrayQueue {
    private String[] queue;
    private int front, rear, capacity;

    public StudentArrayQueue(int size) {
        capacity = size;
        queue = new String[capacity];
        front = 0;
        rear = 0;
    }

    public void enqueue(String student) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = student;
        System.out.println("Enqueued: " + student);
    }

    public String dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[front++];
    }

    public static void main(String[] args) {
        StudentArrayQueue studentQueue = new StudentArrayQueue(3);

        studentQueue.enqueue("Son");
        studentQueue.enqueue("Minh");
        studentQueue.enqueue("Phuc");

        while (studentQueue.front < studentQueue.rear) {
            System.out.println("Dequeue: " + studentQueue.dequeue());
        }
    }
}
