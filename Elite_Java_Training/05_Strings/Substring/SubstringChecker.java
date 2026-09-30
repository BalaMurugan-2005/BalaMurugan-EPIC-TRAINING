/*// import java.util.*;

// public class Main
// {
// 	public static void main(String[] args) {
// 	Scanner in = new Scanner(System.in);
// 	String str = "hello";
// 	for(int i=0;i<str.length();i++){
// 	    System.out.println();
// 	    for(int j=i;j<str.length();j++){
// 	        System.out.print(str.charAt(j) + " ");
// 	    }
// 	}
// 	for(int i=0;i<str.length();i++){
// 	    System.out.println();
// 	    for(int j=0;j<=i;j++){
// 	        System.out.print(str.charAt(j) + " ");
// 	    }
// 	}

// 	for(int i=str.length()-1;i>=0;i--){
// 	    System.out.println();
// 	    for(int j=str.length()-1;j>=i;j--){
// 	        System.out.print(str.charAt(j) + " ");
// 	    }
// 	}
// 	}
// }
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str2 = in.nextLine();
		for(int k=0; k<str.length(); k++) {

			for(int i=k; i<str.length(); i++) {
				String emp = "";
				for(int j=k; j<=i; j++) {
					emp+=str.charAt(j);
				}
				if(emp.equals(str2)) {
					System.out.println("Its a SubString");
				}
			}
		}
	}
}