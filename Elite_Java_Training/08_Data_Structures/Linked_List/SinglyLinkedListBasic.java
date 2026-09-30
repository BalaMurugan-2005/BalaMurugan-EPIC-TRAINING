import java.util.Scanner;

class Node {
    int data;
    Node address;
    Node(int data, Node add) {
        this.data = data;
        this.address = add;
    }
}

/**
 * Basic Singly Linked List (Node-based input)
 * FIXED: Missing '{' after "public class Main" and missing ';' after "Node temp = head"
 */
public class SinglyLinkedListBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node head = null, prev = null;
        System.out.print("Enter the number of data: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int val = in.nextInt();
            Node obj = new Node(val, null);
            if (head == null) {
                head = obj;
                prev = obj;
            } else {
                prev.address = obj;
                prev = obj;
            }
        }
        System.out.println("\nLinked List:");
        // FIXED: was "Node temp = head" (missing semicolon)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.address;
        }
        System.out.println("null");
        in.close();
    }
}
