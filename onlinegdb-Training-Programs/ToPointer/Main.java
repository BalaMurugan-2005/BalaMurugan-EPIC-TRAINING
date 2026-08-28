import java.util.*;

class Programs{
    void pair_Sum(){
        Scanner in = new Scanner(System.in);
	    
	    int size = in.nextInt();
	    
	    int[] arr = new int[size];
	    
	    for(int i=0; i<size;i++){
	        arr[i] = in.nextInt();
	    }
	    int target = 10;
	    int left =0;
	    int right =arr.length-1;
	    boolean is_found = false;
	    while(left < right){
	        int sum = arr[left] + arr[right];
	        if(sum == target){
	            is_found = true;
	            break;
	        }
	        if(left > sum){
	            left++;
	        }
	        else{
	        right--;
	        }
	    }
	    if(is_found){
	        System.out.println("yes");
	    }
	    else{
	        System.out.println("False");
	    }
    }
}


public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int size = in.nextInt();
	    
	    int[] arr = new int[size];
	    
	    for(int i=0; i<size;i++){
	        arr[i] = in.nextInt();
	    }
	    
	    int target = 14;
	    
	    int left =0;
	    int right = arr.length-1;
	    
	    while(left < right){
	        int sum = arr[left] + arr[right];
	        if(sum == target){
	            System.out.print(arr[left] + ","+ arr[right]);
	            
	        }
	        if(left > sum){
	            left++;
	        }
	        else{
	            right--;
	        }
	        
	    }
	    
	}
}
