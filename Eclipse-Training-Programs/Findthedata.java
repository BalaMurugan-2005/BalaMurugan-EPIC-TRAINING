package myfirstproject;
import java.util.*;
public class Findthedata {
	public static void main() {
	Scanner in = new Scanner(System.in);
	char data= in.next().charAt(0);
	
	if('A' <= data && 'Z'>= data  || 'a' <= data && 'z' >= data) { //A-65 Z-90  65 <=65 90 >=65  or  && or 
		System.out.println("it is an alphbet");
	}else if('0' <= data && '9' >= data) {
		System.out.println("It was interger");
	}else {
		System.out.println("it was special charecter");
	}
	}
}
