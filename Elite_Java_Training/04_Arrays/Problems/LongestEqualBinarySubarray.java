import java.util.Scanner;

public class Main
{
    static int longestSubString(String str){
        int sum;
        int max=0;
       for(int i=0;i<str.length();i++){
           sum=0;
           //count = 0;
           for(int j=i;j<str.length();j++){
               if(str.charAt(j)=='1'){
                   sum++;
               }
               else{
                   sum--;
               }
               if(sum==0){
                   int count =((j-i)+1); 
                   if(count>max){
                       max=count;
                   }
               }
           }
       }
       return max;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(Main.longestSubString(str));
	}
}
//task print that subarray
