package myfirstproject;
import java.util.Scanner;
public class Sorting1 {
	public static void main(String[] args) {
		

		
			    Scanner in  = new Scanner(System.in);
			    int n = in.nextInt();
			    int[] arr1 = new int[n];
			    int[] arr2 = new int[n];
			    
			    for(int i=0;i<n;i++){
			        int count = 0;
			        arr1[i] = in.nextInt();
			        for(int j=2;j<=(arr1[i])/2;j++){
			            if(arr1[i]%j==0){
			                count++;
			            }
			        }
			        arr2[i] = count;
			    }
			    
			    for(int i=0;i<n;i++){
			        System.out.println(arr2[i]);
			    }
			   
			}


	}

