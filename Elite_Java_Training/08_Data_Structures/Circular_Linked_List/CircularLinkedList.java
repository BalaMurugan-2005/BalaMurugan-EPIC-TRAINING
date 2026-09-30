import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node head = null, tail = null;

    public Node() {}

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    void insertData(Scanner in) {
        System.out.println("Enter the number of data: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            Node obj = new Node(val, null);
            if (head == null) {
                head = obj;
            } else {
                tail.next = obj;
            }
            tail = obj;
            obj.next = head;
        }
    }

    void display() {
        Node temp = head.next;
        System.out.println(head.data);
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    void insertAtFront(Scanner in) {
        System.out.println("Enter the data to add first:");
        int val = in.nextInt();
        Node newnode = new Node(val, null);
        newnode.next = tail.next;
        tail.next = newnode;
        head = tail.next;
    }

    // FIXED: removed duplicate 'int val' declaration – use parameter directly
    void insertAtFront(int val) {
        Node newnode = new Node(val, null);
        newnode.next = tail.next;
        tail.next = newnode;
        head = tail.next;
    }

    void insertAtLast(Scanner in) {
        System.out.println("Enter the data to add last:");
        int val = in.nextInt();
        Node newnode = new Node(val, null);
        newnode.next = head;
        tail.next = newnode;
        tail = newnode;
    }

    // FIXED: removed re-declaration of val and bad Scanner call
    void insertAtLast(int val) {
        Node newnode = new Node(val, null);
        newnode.next = head;
        tail.next = newnode;
        tail = newnode;
    }

    int countList() {
        int count = 1;
        Node temp = head.next;
        while (temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtPosition(Scanner in) {
        System.out.println("Enter the value:");
        int val = in.nextInt();
        int length = countList();
        System.out.println("Available positions 1 - " + (length + 1));
        System.out.println("Enter the position:");
        int pos = in.nextInt();
        Node newNode = new Node(val, null);
        if (pos == 1) {
            insertAtFront(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            insertAtLast(val);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node node = new Node();
        while (true) {
            System.out.println("1) Insert Data\n2) Display\n3) Insert at Front\n4) Insert at Last\n5) Insert at Position\n0) Exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1: node.insertData(in);        break;
                case 2: node.display();              break;
                case 3: node.insertAtFront(in);     break;
                case 4: node.insertAtLast(in);      break;
                case 5: node.insertAtPosition(in);  break;
                case 0: System.exit(0);
            }
        }
    }
}
