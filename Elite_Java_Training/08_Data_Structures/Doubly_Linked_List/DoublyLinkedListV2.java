import java.util.*;

class Node {
    Node prev;
    int data;
    Node next;

    int count = 0;

    Node head = null;
    Node tail = null;

    Node() {
    }

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    void insert(Scanner in) {
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            int val = in.nextInt();
            Node obj = new Node(null, val, null);
            if (head == null) {
                head = obj;
                tail = obj;
            } 
            else {
                obj.prev = tail;
                tail.next = obj;
                tail = obj;
            }
            count++;
        }
    }
    void displayForward() {
        System.out.println("Linkelist forward");
        Node temp = head;
        while (temp != null) {
            System.out.println("Next value = " + temp.data);
            temp = temp.next;
        }
    }
    void displayReverse() {
        System.out.println("Linked list Backward");
        Node temp = tail;
        while (temp != null) {
            System.out.println("Previous value = " + temp.data);
            temp = temp.prev;
        }
    }
    void insertAtMiddle(Scanner in) {
        int val = in.nextInt();
        Node newNode = new Node(null, val, null);
        
        int middle = count / 2;
        Node temp = head;
        for (int i = 0; i < middle - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        count++;
    }
    void sizeOfList() {
        System.out.println(count);
    }
    void insertAtPosition(Scanner in) {
        int pos = in.nextInt();
        int val = in.nextInt();

        Node newNode = new Node(null, val, null);
        
        if (pos == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            count++;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } 
        else {
            tail = newNode;
        }
        temp.next = newNode;
        count++;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Node node = new Node();

        while (true) {

            System.out.println(
                "1.)Insert A Node \n" +
                "2.)Display A Linked List \n" +
                "3.)Display Reverse A List \n" +
                "4.)Insert At Middle \n" +
                "5.)count \n" +
                "6.)Insert At Position"
            );

            int choice = in.nextInt();

            switch (choice) {

                case 1:
                    node.insert(in);
                    break;

                case 2:
                    node.displayForward();
                    break;

                case 3:
                    node.displayReverse();
                    break;

                case 4:
                    node.insertAtMiddle(in);
                    break;

                case 5:
                    node.sizeOfList();
                    break;

                case 6:
                    node.insertAtPosition(in);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

