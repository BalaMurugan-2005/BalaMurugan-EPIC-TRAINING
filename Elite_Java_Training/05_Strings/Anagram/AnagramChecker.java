import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String str1 = in.nextLine();//bca
	        String str2 = in.nextLine();//bac
	        char[] strArr1 = str1.toCharArray();
	        char[] strArr2 = str2.toCharArray();
	        Arrays.sort(strArr1);//[a,b,c]
	        Arrays.sort(strArr2);//[a,b,c]
	        String convStr1 = Arrays.toString(strArr1); //abc
	        String convStr2 = Arrays.toString(strArr2); //abc 
	        
	        if(convStr1.equals(convStr2)){
	            System.out.println("Its an Anagram");
	        }
	        else{
	            System.out.println("Not an Anagram");
	        }
	}
}
