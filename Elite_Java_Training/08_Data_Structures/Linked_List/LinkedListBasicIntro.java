class Node{
    int data;
    Node address;
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
}
public class Main {
	public static void main(String[] args) {
		Node obj1 = new Node(10,null);
		Node head = obj1;
		Node obj2 = new Node(20,null);
		obj1.address = obj2;
		Node obj3 = new Node(30,null); 
		obj2.address = obj3;
		Node obj4 = new Node(40,null);
		obj3.address = obj4;
		Node temp = head;
		while( temp != null){
		    System.out.println(temp.address);
		    temp = temp.address;
		}
		//System.out.println(head.address.address.address.data);
	}
}