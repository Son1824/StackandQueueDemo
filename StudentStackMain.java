package StackandQueueDemo;

import java.util.Stack;

public class StudentStackMain {
    public static void main(String[] args) {
        Stack<Student> student = new Stack<>();
        StudentStack studentStack = new StudentStack();

        studentStack.pushStudents(student);

        studentStack.peekStudent(student);

        studentStack.popStudents(student);

        studentStack.checkIsEmpty(student);

        studentStack.peekStudent(student);
    }
}
