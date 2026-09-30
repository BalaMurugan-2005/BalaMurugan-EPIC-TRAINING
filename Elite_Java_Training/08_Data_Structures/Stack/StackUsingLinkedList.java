import java.util.*;
class Node {
	int data;
	Node next;
	Node(int val,Node address) {
		this.data = val;
		this.next = address;
	}
	Node(){
	    
	}
	Node top = null;
	void push(Scanner in) {
		System.out.println("Enter the data");
		int val = in.nextInt();
		Node obj = new Node(val,top);
		top=obj;
	}
	void pop() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println(top.data);
		top = top.next;

	}
	void display() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}
		Node temp = top;
		System.out.println("Stack elements:");
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void peek() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Top element: " + top.data);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node obj = new Node();
		while(true) {
			System.out.println("1.)push \n 2.)pop \n 3.) peek \n 4.) display");
			int chose = in.nextInt();
			switch(chose) {
			case 1:
				obj.push(in);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.peek();
			case 4:
				obj.display();
			}
		}
	}
}