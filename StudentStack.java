package StackandQueueDemo;

import java.util.Stack;

public class StudentStack {
    public void pushStudents(Stack<String> stack) {
        System.out.println("Adding students to the stack...");
        stack.push("Son");
        System.out.println("Pushed: Son");
        stack.push("Minh");
        System.out.println("Pushed: Minh");
        stack.push("Phuc");
        System.out.println("Pushed: Phuc");
    }

    public void popStudents(Stack<String> stack) {
        System.out.println("Removing students from the stack...");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("Stack is empty.");
    }

    public static void main(String[] args) {
        Stack<String> student = new Stack<>();
        StudentStack studentStack = new StudentStack();

        studentStack.pushStudents(student);
        studentStack.popStudents(student);
    }
}
