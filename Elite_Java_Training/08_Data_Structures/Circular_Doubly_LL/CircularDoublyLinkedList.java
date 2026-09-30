import java.util.Scanner;
/*
import java.util.Scanner;

class Node{
    int data;
    Node prev,next;
    
    public Node(int data,Node prev,Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    
    
    public void insertData(Scanner in){
        System.out.println("Enter the no of data: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the val: ");
            int val = in.nextInt();
            Node obj = new Node(null,val,null);
            if(head==null){
                head=obj;
            }
            else{
                tail.next=obj;
                obj.prev=tail;
            }
            tail=obj;
            head.prev=obj;
            obj.next=head;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		
	}
}

*/
class Node {
	int data;
	Node prev,next;
	Node head = null, tail = null;
	public Node(Node prev,int data,Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	Node() {

	}
	public void insertData(Scanner in) {
		System.out.println("Enter the no of data: ");
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			int val = in.nextInt();
			Node obj = new Node(null,val,null);
			if(head==null) {
				head=obj;
			}
			else {
				tail.next=obj;
				obj.prev=tail;
			}
			tail=obj;
			obj.prev = obj;
			obj.next = head;
		}
	}
	void display() {
		Node temp = head.next;
		System.out.println(head.data);
		while(temp !=head) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	int count() {
		int count = 1;
		Node temp = head.next;
		while(temp !=head) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	 void deleteFront() {
        if (head == null)
            return;

        if (head.next == head) {
            head = null;
        } else {
            Node last = head.prev;
            head = head.next;
            head.prev = last;
            last.next = head;
        }
    }

    void deletePosition(int position) {
        if (position == 1) {
            deleteFront();
            return;
        }
        Node temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;

            if (temp == head)
                return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

	void insertinmiddle(Scanner in) {
		int length = count();
		System.out.println("Enter value");
		int val = in.nextInt();
		Node temp = head;
		for(int i = 0; i < length / 2; i++) {
			temp = temp.next;
		}
		Node newNode = new Node(null, val, null);
		newNode.prev = temp.prev;
		newNode.next = temp;
		temp.prev.next = newNode;
		temp.prev = newNode;
	}
}
public class Main {
	public static void main(String[] args) {
		Node node = new Node();
		Scanner in = new Scanner(System.in);
		node.insertData(in);
		node.display();
		System.out.println(node.count());
		node.insertinmiddle(in);
		node.display();
	}
}
7