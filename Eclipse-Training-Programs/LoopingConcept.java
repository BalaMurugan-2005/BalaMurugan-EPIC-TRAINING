package myfirstproject;
import java.util.*;
public class LoopingConcept {
	public static void main() {
		Scanner in = new Scanner(System.in);
		String str = "abc";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'z') {
				System.out.println("a");
			}
			else if(ch =='Z') {
				System.out.println("A");
			}
			else {
				System.out.println((char) (ch +1)); //a->97 b ->98
			}
		}
	}
}
