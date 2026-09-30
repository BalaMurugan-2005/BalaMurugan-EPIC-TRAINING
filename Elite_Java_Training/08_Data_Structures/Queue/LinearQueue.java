import java.util.Scanner;

class QueueImplementation {
    int n = 6;
    int[] queue = new int[n];
    int front = -1;
    int rear = -1;

    void enQueue(Scanner in) {
        if (rear == n - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            System.out.println("Enter the value: ");
            ++rear;
            queue[rear] = in.nextInt();
        }
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue UnderFlow");
        } else {
            System.out.println("The deleted Data is: " + queue[front]);
            front++;
            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}

public class LinearQueue {
    public static void main(String[] args) {
        QueueImplementation qi = new QueueImplementation();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) EnQueue\n2) Dequeue\n3) Display\n0) Exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1: qi.enQueue(in);   break;
                case 2: qi.dequeue();     break;
                case 3: qi.display();     break;
                case 0: System.exit(0);
            }
        }
    }
}
