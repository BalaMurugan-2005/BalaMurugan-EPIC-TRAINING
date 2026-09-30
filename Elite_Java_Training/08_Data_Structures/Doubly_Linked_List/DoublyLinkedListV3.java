import java.util.*;

class Node {
    Node prev;
    int data;
    Node next;

    Node head = null;
    Node tail = null;
    int count = 0;

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

            Node newNode = new Node(null, val, null);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } 
            else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }

            count++;
        }
    }
    int sizeOfList() {
        return count;
    }

    void displayForward() {

        System.out.println("Linked List Forward");

        Node temp = head;

        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.next;
        }
    }
    void displayReverse() {

        System.out.println("Linked List Backward");

        Node temp = tail;

        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.prev;
        }
    }

    void insertAtMiddle(Scanner in) {

        int val = in.nextInt();

        Node newNode = new Node(null, val, null);

        if (head == null) {
            head = newNode;
            tail = newNode;
            count++;
            return;
        }

        int middle = count / 2;

        Node temp = head;

        for (int i = 0; i < middle - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next = newNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        } 
        else {
            tail = newNode;
        }

        count++;
    }

    void insertAtPosition(Scanner in) {

        int pos = in.nextInt();
        int val = in.nextInt();

        if (pos < 1 || pos > count + 1) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(null, val, null);

        if (pos == 1) {

            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            } 
            else {
                tail = newNode;
            }

            head = newNode;

            count++;
            return;
        }
        if (pos == count + 1) {

            newNode.prev = tail;

            tail.next = newNode;

            tail = newNode;

            count++;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.prev = temp;
        newNode.next = temp.next;

        temp.next.prev = newNode;
        temp.next = newNode;

        count++;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Node node = new Node();

        while (true) {

            System.out.println();
            System.out.println("1. Insert Nodes");
            System.out.println("2. Display Forward");
            System.out.println("3. Display Reverse");
            System.out.println("4. Insert At Middle");
            System.out.println("5. Insert At Position");
            System.out.println("6. Count");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            int choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of nodes: ");
                    node.insert(in);
                    break;

                case 2:
                    node.displayForward();
                    break;

                case 3:
                    node.displayReverse();
                    break;

                case 4:
                    System.out.print("Enter value: ");
                    node.insertAtMiddle(in);
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    int pos = in.nextInt();

                    System.out.print("Enter value: ");
                    int val = in.nextInt();

                    if (pos < 1 || pos > node.count + 1) {
                        System.out.println("Invalid Position");
                    } 
                    else {

                        Node newNode = new Node(null, val, null);

                        if (pos == 1) {

                            newNode.next = node.head;

                            if (node.head != null) {
                                node.head.prev = newNode;
                            } 
                            else {
                                node.tail = newNode;
                            }

                            node.head = newNode;
                        } 
                        else if (pos == node.count + 1) {

                            newNode.prev = node.tail;
                            node.tail.next = newNode;
                            node.tail = newNode;
                        } 
                        else {

                            Node temp = node.head;

                            for (int i = 1; i < pos - 1; i++) {
                                temp = temp.next;
                            }

                            newNode.prev = temp;
                            newNode.next = temp.next;

                            temp.next.prev = newNode;
                            temp.next = newNode;
                        }

                        node.count++;

                        
                    }
                    break;

                case 6:
                    System.out.println("Size = " + node.sizeOfList());
                    break;

                case 7:
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}