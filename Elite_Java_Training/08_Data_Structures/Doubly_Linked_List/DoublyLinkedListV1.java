import java.util.Scanner;

class Node {
    Node prev;
    int data;
    Node next;
    int count = 0;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    Node() {}
}

class DoublyLL {
    Node head = null;
    Node tail = null;
    int count = 0;

    void insert(Scanner in) {
        int val = in.nextInt();
        Node newNode = new Node(null, val, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insertAtMiddle(Scanner in) {
        int val = in.nextInt();
        Node newNode = new Node(null, val, null);
        Node temp = head;
        int mid = count / 2;
        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        count++;
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
            if (temp.next == null) break;
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        count++;
    }

    void insertFirst(Scanner in) {
        int val = in.nextInt();
        Node newNode = new Node(null, val, null);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        count++;
    }

    void deleteFirst() {
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        count--;
    }

    // FIXED: was using undeclared variable 'position'; now uses parameter pos
    void deleteByPosition(Scanner in) {
        System.out.println("Enter position to delete (1-" + count + "):");
        int pos = in.nextInt();
        if (pos == 1) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            if (temp == null) return;
            temp = temp.next;
        }
        if (temp == null) { System.out.println("Position out of range"); return; }
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp == tail) tail = temp.prev;
        count--;
    }
}

public class DoublyLinkedListV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DoublyLL dll = new DoublyLL();
        while (true) {
            System.out.println("1) Insert\n2) Display\n3) Display Reverse\n4) Insert at Middle\n5) Insert at Position\n6) Insert at First\n7) Delete First\n8) Delete by Position\n0) Exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1: dll.insert(in);             break;
                case 2: dll.display();               break;
                case 3: dll.displayReverse();        break;
                case 4: dll.insertAtMiddle(in);      break;
                case 5: dll.insertAtPosition(in);    break;
                case 6: dll.insertFirst(in);         break;
                case 7: dll.deleteFirst();            break;
                case 8: dll.deleteByPosition(in);    break;
                case 0: System.exit(0);
            }
        }
    }
}
