import java.util.*;
class Programs{
    void p1(){
        //scp 
		String str1 = "Hello";//100
		String str2 = "Hello";//100
		//String str3="bala";//100
		//heap
		String str3 = new String("Hello");//200
		String str4 = new String("Hello");//300
		System.out.println(str1==str2);
		System.out.println(str3==str4);
    }
    void p2(){
        Scanner in = new Scanner(System.in);
		String str = in.nextLine();//Hello
		String empStr = ""; // "H e l l o "
		for(int i=0;i<str.length();i++){
		    empStr+=str.charAt(i);
		    empStr+=" ";
		}
		System.out.println(empStr);
    }
    
    String reverseString(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine(); // bala
	    String output="";
	   for(int i = input.length()-1;i>=0;i--){
	       output+=input.charAt(i);
	   }
	   return output;
    }
}
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   Programs p = new Programs();
	   System.out.println(p.reverseString());
	}
}
