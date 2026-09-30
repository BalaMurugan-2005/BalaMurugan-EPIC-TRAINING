package myfirstproject;
import java.util.*;
public class New {
public static void main(String[] args) {
		    Scanner in  = new Scanner(System.in);
		    int n = in.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = in.nextInt();
		    }
		    for(int i=0;i<n;i+=2){
		        for(int j=0;j<n;j++){
		            if(i!=j ){
		                if((j<i && j%2!=0) || j>i){
		                     if(arr[j]>arr[i]){
		                         int temp = arr[i];
		                         arr[i] = arr[j];
		                         arr[j] = temp;
		                     }
		                } 
		            }
		        }
		    }
		    
		    for(int i=0;i<n;i++){
		        System.out.print(" ," + arr[i]);
		    }
		}
	}
