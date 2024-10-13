package StackandQueueDemo;

import java.util.Stack;

public class StudentStack {
    public void pushStudents(Stack<Student> stack) {
        System.out.println("Adding students to the stack...");
        stack.push(new Student(1, "Son", 8.0));
        System.out.println("Pushed: " + stack.peek());
        stack.push(new Student(2, "Minh", 5.5));
        System.out.println("Pushed: " + stack.peek());
        stack.push(new Student(3, "Phuc", 7.0));
        System.out.println("Pushed: " + stack.peek());
    }

    public void popStudents(Stack<Student> stack) {
        if (!stack.isEmpty()) {
            Student removedStudent = stack.pop();
            System.out.println("Removed: " + removedStudent);
        } else {
            System.out.println("Stack is empty, no student to remove.");
        }
    }
    public void peekStudent(Stack<Student> stack) {
        if (!stack.isEmpty()) {
            System.out.println("Top student: " + stack.peek());
        } else {
            System.out.println("Stack is empty.");
        }
    }
    public void checkIsEmpty(Stack<Student> stack) {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}
