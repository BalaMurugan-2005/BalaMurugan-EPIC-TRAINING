/*
import java.util.Scanner;
class Node {
    int data;
    Node address;
    Node head = null;
    Node(int data, Node add) {
        this.data = data;
        this.address = add;
    }
    Node() {
    }
    void insertData() {
        Scanner in = new Scanner(System.in);
        Node prev = null;
        System.out.println("Enter the no of Data:");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int val = in.nextInt();
            Node obj = new Node(val, null);
            if (head == null) {
                head = obj;
                prev = obj;
            }
            else {
                prev.address = obj;
                prev = obj;
            }
        }
    }
    void displayData() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.address;
        }
    }
    void getData() {
    }
}
public class Main {
    public static void main(String[] args) {
        Node n = new Node();
        n.insertData();
        System.out.println("Linked List:");
        n.displayData();
    }
}

import java.util.Scanner;

class Node{
    int data;
    Node address;
    Node head = null,prev=null;
    
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
    
    Node(){
        
    }
    
    
    void insertData(Scanner in){
        System.out.println("Enter the no of Data: ");
            int n = in.nextInt();//3-->10,20,30
            for(int i=0;i<n;i++){
                int val = in.nextInt();//10
                Node obj = new Node(val,null);
                if(head==null){
                    head = obj;
                    prev=obj;
                }
                else{
                    prev.address = obj;
                    prev=obj;
                }
            }
    }
    
    void displayData(){
        	Node temp = head;
    		while(temp!=null){
		    System.out.println(temp.data);//40
		    temp=temp.address;//null
		}
    }
    
    void getData(){
        
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	    
	 
	    Scanner in = new Scanner(System.in);
	    
	    
	    
	    Node node = new Node();
	    
		node.insertData(in);
        node.displayData();
	
	}
}



 */
import java.util.Scanner;
class Node{
    int data;
    Node address;
    Node head = null,prev=null;
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
    Node(){
        
    }
    void insertData(Scanner in){
        System.out.println("Enter the no of Data: ");
            int n = in.nextInt();//3-->10,20,30
            for(int i=0;i<n;i++){
                int val = in.nextInt();//10
                Node obj = new Node(val,null);
                if(head==null){
                    head = obj;
                    prev=obj;
                }
                else{
                    prev.address = obj;
                    prev=obj;
                }
            }
    }
    void displayData(){
        	Node temp = head;
    		while(temp!=null){
		    System.out.println(temp.data);//40
		    temp=temp.address;//null
		}
    }
    void insertANode(Scanner in){
        System.out.println("Enter the position");
        int n = in.nextInt();//2
        System.out.println("Enter the value: ");
        int val = in.nextInt();//55
        Node newNode = new Node(val,null);
        Node temp = head;//1000
        for(int i=0;i<n-2;i++){
            temp=temp.address;
        }
        newNode.address = temp.address;
        temp.address = newNode;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    Node node = new Node();
		node.insertData(in);
        node.displayData();
        node.insertANode(in);
        node.displayData();
	}
}