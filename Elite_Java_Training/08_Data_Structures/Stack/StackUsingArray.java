import java.util.*;
class StackImplementation {
	int n = 2;
	int[] stack = new int[n];
	int top = -1;
	//push
	public void push(Scanner in) {
		System.out.println(top);
		System.out.println("Enter a value: ");
		int val = in.nextInt();
		if(top>=n-1) {
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			stack[top] = val;
		}
	}
	public void pop(Scanner in) {
		if(top == -1) {
			System.out.println("Stack UnderFlow");
		} else {
			System.out.println(stack[top]);
			top--;
		}
	}
	void display() {
		if(top == -1) {
			System.out.println("Stack UnderFlow");
		}
		else {
			for(int i=top; i>=0;i--) {
				System.out.println(stack[i]);
			}
		}
	}
	public boolean isEmpty(){
	    if(top==-1){
	        return true;
	    }
	    return false;
	}
	public void peek(){
	    if(isEmpty()){
	        System.out.println("Stack is Empty");
	    }else{
	        System.out.println(stack[top]);
	    }
	}
	//pop
	//peak
	//isEmpty
	//display
}


public class Main
{
	public static void main(String[] args) {
		StackImplementation st = new StackImplementation();
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.println("1.)Push \n 2.)Pop \n 3.)display \n 4.)Is Empty \n 5.) Peek ");
			int chose = in.nextInt();
			switch(chose) {
			case 1:
				st.push(in);
				break;

			case 2: {
				st.pop(in);
				break;
			}
			case 3 :
				st.display();
				break;
			}
		}
	}
}
