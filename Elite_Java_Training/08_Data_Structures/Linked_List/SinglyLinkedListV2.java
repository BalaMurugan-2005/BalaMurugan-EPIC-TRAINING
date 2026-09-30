import java.util.*;
class Node{
    int data;
    Node next;
    int count=0;
    Node head = null , tail = null;
    Node (int data , Node address){
        this.data = data;
        this.next = address;
    }
    Node(){
        
    }
    void insertdata(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size ");
        int size = in.nextInt();
        for(int i=0;i<size;i++){
            int val = in.nextInt();
            Node newNode = new Node(val,null);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void insertATMiddle(Scanner in){
        sizeOfList();
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        int pos = (count/2)+1;
        System.out.println("Position" + pos);
        Node newNode = new Node(val,null);
        Node temp = head;
        for(int i=0;i<pos-2;i++){
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        }
    void insertFront(Scanner in){
        int val = in.nextInt();
        Node newNode =new Node(val,null);
        newNode.next = head;
        head = newNode;
    }
    void sizeOfList(){
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
    }
    void insertatend(Scanner in){
        int val = in.nextInt();
        Node newNode = new Node(val,null);
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
        }
         temp.next = newNode;
         tail = newNode;
    }
    void deleteNode(Scanner in){
        System.out.println("Enter the Position");
        int pos = in.nextInt();
        Node temp = head;
        if(pos == 1){
            head = temp.next;
        }
        for(int i=0;i<pos-2;i++){
            temp = temp.next;
        }
        
        if(temp.next.next == null){
            tail = temp;
        }
        temp.next = temp.next.next;
    }
    // void reverseLL(){
        
    // }
    void displatail(){
        
        System.out.println();
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		Node node = new Node();
		node.insertdata();
		node.display();
		node.displatail();
// 		node.insertFront(in);
// 		node.display();
// 		node.deleteNode(in);
// 		node.display();
	}
}
