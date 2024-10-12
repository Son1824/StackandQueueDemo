package StackandQueueDemo;

public class StudentLinkedListQueue {
    StudentQueueNode front, rear;

    public StudentLinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String student) {
        StudentQueueNode studentQueueNode = new StudentQueueNode(student);
        if (this.rear == null) {
            this.front = this.rear = studentQueueNode;
            System.out.println("Enqueued: " + student);
            return;
        }
        this.rear.next = studentQueueNode;
        this.rear = studentQueueNode;
        System.out.println("Enqueued: " + student);
    }

    public String dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        String student = this.front.data;
        this.front = this.front.next;

        if (this.front == null){
            this.rear = null;
        }
        System.out.println("Dequeued: " + student);
        return student;
    }

}
