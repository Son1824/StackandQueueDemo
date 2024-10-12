package StackandQueueDemo;

public class LinkedListQueueMain {
    public static void main(String[] args) {
        StudentLinkedListQueue studentQueue = new StudentLinkedListQueue();

        studentQueue.enqueue("Son");
        studentQueue.enqueue("Minh");
        studentQueue.enqueue("Phuc");

        studentQueue.dequeue();
        studentQueue.dequeue();
        studentQueue.dequeue();
    }
}
