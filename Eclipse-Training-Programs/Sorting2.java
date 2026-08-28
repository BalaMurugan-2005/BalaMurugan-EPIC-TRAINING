package myfirstproject;



public class Sorting2 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,5};
		int arr2[] = {7,2,4};
		int len = arr1.length + arr2.length;
	    int[] merged = new int[len];
	    String hi = "HI";
	    // 1 2 3 5  = 7 2 4 //
	    
	    for(int i=0; i<len; i++) {
	    	for(int j=i;j<arr2.length; j++) {
	    		if(arr1[i] < arr2[j]) {
	    			int temp = arr1[i];
	    			merged[j] = arr1[i];
	    			merged[j] = temp;
	    			
	    		}
	    	}
	    	
	    }
	    for(int i=0;i<len; i++) {
	    	System.out.println(merged[i]);
    	}
	    
		
	}
}
