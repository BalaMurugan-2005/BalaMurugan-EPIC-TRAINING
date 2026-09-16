/*
// import java.util.Scanner;

// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		String str = in.nextLine();//abcd
// 		int[] count = new int[26];
// // 		for(int i=0;i<26;i++){
// // 		    System.out.print(count[i]+" ");
// // 		}
// 		for(int i=0;i<str.length();i++){
// 		    int val = str.charAt(i) - 97;
// 		    count[val]++;
// 		}
// 		System.out.println();
// 		for(int i=0;i<26;i++){
// 		    if(count[i] >0){
// 		    System.out.print((char)(i+97) + "=" +count[i]+" ");
// 		    }
// 		}
// 	}
// }

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();//abcd
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i) - 97; //a=97
// 			if(val < 0){
// 			    val = val - ;
// 			}
			System.out.println(val);
			count[val]++;
		}
		System.out.println();
		// 		for(int i=0;i<26;i++){
		// 		    if(count[i]>0)
		// 		    System.out.println((char)(i+97)+" "+count[i]+" ");
		// 		}
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i) - 97;
			if(count[val]>0) {
				System.out.println(str.charAt(i)+"-"+count[val]);
			}
			if(count[val]>1) {
				count[val]=0;
			}
		}
	}
}*/
/*
//oucrence
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String str = in.nextLine();//Dharaneesh
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				int val = str.charAt(i)-'A';
				count[val]++;
			}
			else {
				int val = str.charAt(i)-'a';
				count[val]++;
			}
		}
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >='A' && str.charAt(i) <='Z'){
			    if(count[str.charAt(i) - 'A']>1){
			        System.out.println(str.charAt(i));
			        count[str.charAt(i)-'A']=0;
			    }
			}
			else{
			    if(count[str.charAt(i)-'a']>1){
			        System.out.println(str.charAt(i));
			        count[str.charAt(i)-'a']=0;
			    }
			}
		}
		// 		for(int i=0;i<str.length();i++){
		// 		    if(count[str.charAt(i)-'a']>0)
		// 		    System.out.print(str.charAt(i)+" "+count[str.charAt(i)-'a']+" ");
		// 		    if(count[str.charAt(i)-'a']>1){
		// 		        count[str.charAt(i)-'a']=0;
		// 		    }
		// 		}
	}
}
*/

/*
//distint
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String str = in.nextLine();//Dharaneesh
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				int val = str.charAt(i)-'A';
				count[val]++;
			}
			else {
				int val = str.charAt(i)-'a';
				count[val]++;
			}
		}
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >='A' && str.charAt(i) <='Z'){
			    if(count[str.charAt(i) - 'A']==1){
			        System.out.println(str.charAt(i));
			        count[str.charAt(i)-'A']=0;
			    }
			}
			else{
			    if(count[str.charAt(i)-'a']==1){
			        System.out.println(str.charAt(i));
			        count[str.charAt(i)-'a']=0;
			    }
			}
		}
		// 		for(int i=0;i<str.length();i++){
		// 		    if(count[str.charAt(i)-'a']>0)
		// 		    System.out.print(str.charAt(i)+" "+count[str.charAt(i)-'a']+" ");
		// 		    if(count[str.charAt(i)-'a']>1){
		// 		        count[str.charAt(i)-'a']=0;
		// 		    }
		// 		}
	}
}
*/