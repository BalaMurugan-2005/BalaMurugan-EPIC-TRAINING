public class Main {
    public static void main(String[] args) {
        String data = "12345-+*/";//8
        int n = data.length() / 2 + 1; //8/2 =4+1=5 
        int output = data.charAt(0) - '0';  // 49 - 48  1
        for (int i = 1; i < n; i++) {
            int num = data.charAt(i) - '0';//2
            char operator = data.charAt(n-1+i);//5-1 4+1 = 5    
            System.out.println(operator);
            switch (operator) {
                case '-':
                 output = output - num;
                    break;
                   case '+':
                 output = output + num;
                    break;
                case '*':
                 output = output * num;
                    break;
                case '/':
                 output = output / num;
                    break;
            }
        }
        System.out.println (output);
    }
}
/*
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = str.length();
		int sum=str.charAt(0)-'0';//1;
		int j=1;
		for(int i=(n/2)+1;i<n;i++){
		    switch(str.charAt(i)){
		        case '+':{
		            
		        }
		        case '-':{
		            sum-=(str.charAt(j)-'0');
		            break;
		        }
		        case '*':{
		            
		        }
		        case '/':{
		            
		        }
		        case '%':{
		            
		        }
		        j++;
		    }
		}
	}
}

*/