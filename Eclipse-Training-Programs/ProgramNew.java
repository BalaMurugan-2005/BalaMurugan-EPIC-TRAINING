package myfirstproject;

public class ProgramNew {
	public static void main(String[] args) {
		int[] arr= {12,8,7,4,25,18,17}; 
		
		for(int i=0;i<=arr.length;i++){
		    //System.out.print(arr[i]+",");
		    i+=1;
		    for(int j=0; j<i; j++) {
		    	if(arr[i] < arr[j]) {
		    		int temp =arr[i];
		    		arr[i] = arr[j];
		    		arr[j]  = temp;
		    		
		    	}
		    }
		    System.out.print(arr[i]);
		}
	}
}
