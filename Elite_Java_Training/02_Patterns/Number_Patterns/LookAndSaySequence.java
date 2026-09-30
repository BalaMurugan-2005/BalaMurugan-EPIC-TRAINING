import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n==1){
		    System.out.println("1");
		}
		else{
		    String str = "1";
		    String emt="";
		    for(int k=1;k<n;k++){
		        System.out.println(str);
		        emt="";
		        for(int i=0;i<str.length();i++){
		            int count = 1;
		            int j;
		            for(j=i+1;j<str.length();j++){
		                if(str.charAt(i)==str.charAt(j)){
		                    count++;
		                }
		                else{
		                    break;
		                }
		            }
		            emt+=count;
		            emt+=str.charAt(i);
		            if(j==str.length()){
		                break;
		            }
		        }
		        str=emt;
		    }
		    System.out.println(str);
		}
	}
}