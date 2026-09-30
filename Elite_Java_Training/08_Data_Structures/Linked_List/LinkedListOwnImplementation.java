package myfirstproject;
import java.io.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedList{
	Node head;
	void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next= newNode;
	}
	void view() {
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
			
		}
		
	}
	void count() {
		Node temp = head;
		int total =0;
		while(temp !=null) {
			total+=1;
			temp = temp.next;
		}
		System.out.println("");
		System.out.println("total Nodes : " + total);
		
	}
	void Searching() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Searching element = ");
		int Element = sc.nextInt();
		Node temp = head;
		boolean Found = false;
		while(temp !=null) {
			if(temp.data == Element) {
				Found = true;
				break;
			}
			temp = temp.next;
		}
		if(Found) {
			System.out.print("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
	}
	void addFirst() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The New node to add first = ");
		int data = sc.nextInt();
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		
		
	}
	void DeleteLastNode() {
		Node temp =head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		temp.next = null;
	}
	void example() {
		Node temp = head;
		System.out.println(temp.next.next.data);
	}
	void DeleteFirst() {
	  head = head.next;
	  
	}
	void insertAtPosition() {
		Scanner sc = new Scanner(System.in);
		Node temp = head;
		System.out.print("ENter the ELement");
		int data = sc.nextInt();
		
		Node newNode = new Node(data);
		
		System.out.print("Enter The positon");
		int pos = sc.nextInt();
		for(int i=1; i<pos-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	void DeleteByValue(int data) {
		 Node temp = head;
		 while (temp.next != null) {
		     if (temp.next.data == data) {
		         temp.next = temp.next.next; 
		          return;
		     }
		   temp = temp.next;
		 }
	}
	void reverseList() {
		Node prev = null;
		Node current = head;
		Node next;

		while(current != null){

		    next = current.next;

		    current.next = prev;

		    prev = current;

		    current = next;
		}

		head = prev;
		
	}
}

public class LinkedListOwn{
	public static void main() {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//list.view();
		list.count();
		//list.Searching();
		//list.addFirst();
		//list.DeleteLastNode();
		//list.view();
		//list.example();
		//list.DeleteFirst();
		//list.view();
		//list.insertAtPosition();
		list.view();
		list.DeleteByValue(30);
		list.view();
		list.reverseList();
		list.view();
	}
}