import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class Stack {
    Node top = null;

    void push(Scanner in) {
        System.out.println("Enter the data:");
        int val = in.nextInt();
        Node obj = new Node(val, top);
        top = obj;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top element: " + top.data);
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack elements (top to bottom):");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;
        do {
            System.out.println("\n===== STACK =====");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1: stack.push(in);    break;
                case 2: stack.pop();       break;
                case 3: stack.peek();      break;
                case 4: stack.display();   break;
                case 5: System.out.println("Program ended"); break;
                default: System.out.println("Invalid choice");
            }
        } while (choice != 5);
        in.close();
    }
}
