package myfirstproject;
import java.util.*;
public class Logic {
	public static void main(String[] args) {
		var num = 1234567890;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		int original = n;
		int reverse = 0;
		int digit;
		
		while(n != 0) {
			digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n/10;
		}
		System.out.println("Original number" + original);
		System.out.println("revesed Number" + reverse);
		/*
		var count =0;
		while(num !=0) {
			count++;
			num = num/10;
		}
		System.out.println(count);
		*/
	}
}
