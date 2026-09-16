import java.util.*;
class Programs{
    void charecters(){
        String value = "zbazlazzzkah";
		for(int i = 0;i<value.length();i++){
		   char ch = value.charAt(i);//arr[1]
		   if(ch == 'z'){
		       System.out.print("a" + " ");
		       continue;
		   }
		   int val = ((int) ch)+1;
		   System.out.print((char) val + " ");
		 
		}
    }
    void charecter2(){
        String empStr="";
      for(int i=0;i<str.length();i++){
          int val = (str.charAt(i) - 97 )+1;//1
          int div = ((val%26)+1)+96;//98
          //int div = ((val%26)+97);
          empStr+=((char)(div));
      }
      System.out.println(empStr);
    }
    void example(){
        // import java.util.Scanner;

// public class Main
// {
//     static String reverseString(String str){//ab
//       String empStr="";
//       for(int i=0;i<str.length();i++){
//           int val = (str.charAt(i) - 97 )+1;//1
//           int div = ((val%26)+1)+96;//98
//           //int div = ((val%26)+97);
//           System.out.println(val);
//           System.out.println(div);
//           empStr+=((char)(div));
           
//       }
//       return empStr;
//     }
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		String str = in.nextLine();
// 		System.out.println(Main.reverseString(str));
// 	}
// }

    }
}
public class Main
{
	public static void main(String[] args) {
	    
    }
}
