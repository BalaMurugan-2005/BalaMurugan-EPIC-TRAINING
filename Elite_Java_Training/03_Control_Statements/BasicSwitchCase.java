package myfirstproject;
import java.util.*;
public class BasicSwitchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		switch(val) {
		  case 1: {
			  System.out.println("Java");
			  break;
			}
		  case 2:{
			  System.out.println("Python");
			  break;
		  }
		  case 3:{
			  System.out.println("html");
			  break;
		  }
		  case 4:{
			  System.out.println("css");
			  break;
		  }
		  default : {
			  System.out.println("Invalid");
		  }
		}
	}
}
