import java.util.*;
class Program{
    void p1(){
        Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
		int[] arr = new int[size];
		int target = 4;
		for(int i =0;i<arr.length; i++){
		    arr[i] = in.nextInt();
		}
		int count =0;
		for(int num : arr){
		    if(num == target){
		        System.out.print("Target Found");
		        break;
		    }
		    
		}
    }
    void p2(){
         
	    int[] arr = {12,4,6,6,7,12,4,7,7,12};
	    
	    for(int i=0;i<arr.length;i++){
	        for(int j = i+1;j<arr.length-1;j++){
	           if(arr[i] !=arr[j] ){
	               continue;
	           }
	           System.out.print(arr[i] + " ");
	        }
	    }
    }
}
public class Main
{
	public static void main(String[] args) {
	   // int[] arr = {12,5,4,6,6,7,12,4,7,5,7};
	    
	   // for(int i=0;i<arr.length;i++){
	   //     for(int j = i+1;j<arr.length-1;j++){
	   //        if(arr[i] !=arr[j] ){
	   //            continue;
	   //        }
	   //        System.out.print(arr[j] + " ");
	   //    }
	   //    /// task = occurence of an array 
	   //}
	}
}
