package myfirstproject;
import java.util.*;
public class Learn{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d = obj.nextInt();
		if(a>b && a>c && a>d) { // 8>5 and 8>8 and 8>3 true 
			System.out.println("A is grater");
		}
		else if(b>=a && b>c && b>d) { // 5>8
			System.out.println("B is grater");
		}
		else if(c>a && c>b && c>d) { //8>8(8>=8) and 8>5 8>3
			System.out.println("C is Grater");
		}
		else {
			System.out.println("D is grater");
		}
	}	
}

