import java.util.*;
class Programs{
    void MultiplicationTable(){
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i =0; i<11; i++){
		    System.out.println( n + " x " + i +" = " + i*n);
		}
    }
    void Optimized_muiltiplication_Table(){
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i =n; i<n*11; i+=n){
		    System.out.println( i);
		}
    }
    void Count_Sum(){
        Scanner in = new Scanner(System.in);
		int input = in.nextInt();  // 1234
		int count =0;
		while(input !=0){  
		    input /=10; 
		    count++;
		}
		System.out.println(count);
    }
    void Removing_zeros_at_end(){
        Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		
		while(input % 10 == 0){ ////5200
		    input /=10; // 52
		}
		System.out.println();
    }
    void Product_of_Number(){
        Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int product = 1;
		while(n !=0){
		    int temp = n%10; // 4
		    product = product * temp;
		    n = n/10;
		}
		System.out.println(product);
		
    }
    void sum_of_factorial(){
        int n=145;
        // for(int i=1; i<5; i++){
        //     n =i*n;  // n 5  5 2 10 30 30 4 120
        // }
        // System.out.println(n);
        
        int sum =0;
        while(n > 0){
            int iSum =1;
            int temp = n%10; // 5
		    for(int i=temp; i>=1; i--){
		        iSum *=i; //120
		    }
		    sum +=iSum;
		    n = n/10;
		    
        }
        System.out.println(sum);
    }
}
public class Main
{
	public static void main(String[] args) {
	    int n = 1234579;
	    while(n !=0){
	        int temp = n %10;
	        System.out.print(temp);
	        n /=10;
	    }
	   
	}
} 
