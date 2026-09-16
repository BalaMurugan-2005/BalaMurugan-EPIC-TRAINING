import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		String str = "11";
		String emp = "";
		for(int i=0;i<str.length();i++){
		    int count = 1;
		    for(int j=i+1;j<str.length();j++){
		        if(str.charAt(i) == str.charAt(j)){
		            count++;
		        }
		        else{
		            break;
		        }
		        System.out.println();
		    }
		    emp+=count;
		    emp+=str.charAt(i);
		}
		System.out.println(emp);
		
	}
}