import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class SinglyLL {
    Node head = null;
    Node tail = null;

    void insert(int val) {
        // FIXED: was missing semicolon after "new Node(val, null)"
        Node obj = new Node(val, null);
        if (head == null) {
            head = obj;
            tail = obj;
        } else {
            tail.next = obj;
            tail = obj;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void findMiddle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }

    void delete(int val) {
        if (head == null) return;
        if (head.data == val) { head = head.next; return; }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found");
    }
}

public class SinglyLinkedListV3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinglyLL list = new SinglyLL();
        System.out.println("Enter number of elements:");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert(in.nextInt());
        }
        System.out.println("Linked List:");
        list.display();
        list.findMiddle();
    }
}
