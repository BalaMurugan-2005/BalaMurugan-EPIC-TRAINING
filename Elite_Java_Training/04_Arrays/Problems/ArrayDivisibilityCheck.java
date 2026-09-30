package myfirstproject;
import java.util.*;
public class Pos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n =in.nextInt(); //1
        int m =in.nextInt(); // 3
        
        int[] a = new int[n]; // 1 3
        
        int[] b = new int[m]; // 2
        
        for(int i=0;i<n; i++){ // 
            a[i] = in.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i] = in.nextInt();
        }
        
        int sum =0;
        
        for(int i=0; i<n/2; i++){ // 1 -1 0
           for(int j=0; j<m; j++){ //
               if(b[j] % a[i]==0){// 16 % 2 32 %2 //
                   sum +=1;
                   if(a[i] % b[j] ==1) {  //3 % 10 
                	   sum +=1;
                   }
               }
           }
        }
        System.out.print(sum);
	}
}
