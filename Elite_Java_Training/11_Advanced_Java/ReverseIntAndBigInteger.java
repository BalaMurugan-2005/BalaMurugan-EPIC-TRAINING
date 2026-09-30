package myfirstproject;
import java.util.Scanner;
import java.math.*;

class LearnPrograms{
	void p1() {
		String num1 = "155656565655665655656";
		String num2 = "483778734587849587948759";
		BigInteger hi = new BigInteger(num1);
		BigInteger second  = new BigInteger(num2);
		BigInteger sum;
		sum = hi.add(second);
		System.out.println(sum);
	}
}

public class Postfix{
	public static void main(String[] args) {
		int n , reverse =0;
		System.out.println("Enter The number to Reverse");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		while(n !=0) {
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
			
		}
		System.out.println(reverse);
	}
	
}

