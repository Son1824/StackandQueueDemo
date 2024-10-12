package StackandQueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class StudentQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Son");
        queue.add("Minh");
        queue.add("Phuc");

        System.out.println("Dequeued: " + queue.remove());
        System.out.println("Dequeued: " + queue.remove());
        System.out.println("Dequeued: " + queue.remove());
    }
}
