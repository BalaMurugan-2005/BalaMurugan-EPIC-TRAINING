package myfirstproject;
import java.util.*;
class Programs{
	void p1() {
        Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr= new int[size];
		int max=0;
		for(int i =0; i<size; i++) {
			arr[i] = in.nextInt();
			if(arr[i] > max) {
				max =arr[i];
			}
		}	
		System.out.println(max);
	}
	void p2(){
Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr= new int[size];
		arr[0] = in.nextInt();
		int min=arr[0];
		for(int i =0; i<size; i++) {
			arr[i] = in.nextInt();
			if(arr[i] < min) {
				min =arr[i];
			}
		}	
		System.out.println(min);
		}
	void p3() {                               // 0    1  2  3    4  5 
		Scanner in = new Scanner(System.in); // [16 , 8, 14,17 ,11,9]
        int n = in.nextInt();
        int[] arr = new int[n];   
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n-1;i++){   //  5 0-5
            int out=-1;
            for(int j=i+1;j<n;j++){     // 0+1 1<5     j=1 i =0     
                if(arr[j]<arr[i]){   //    1< 16 
                    out = arr[j];    // out 8 
                    for(int k=j+1;k<n;k++){  // k= 2 k< =5 
                        if(arr[i]>arr[k] && arr[k]>out){   // 
                            out= arr[k];  
                        }
                    }
                    break;
                }
            }
            System.out.println(out);
        }
        System.out.println(-1);
	}
}
public class Pr1 {
	public static void main(String[] args) {
		
        
	}
}
