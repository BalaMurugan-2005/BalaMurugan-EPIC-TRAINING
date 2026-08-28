import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int[] arr = new int[size];
	   
	    int rot =in.nextInt();
	    int k=0;
	     for(int i=0;i<size;i++){
	        arr[(i+rot+1)%size] = in.nextInt();
	    }
	    while(k<rot){
	        int temp =arr[0];
	        for(int i=0;i<size-1;i++){
	            arr[i] = arr[i+1];
	         }
	         arr[size-1] = temp;
	         k++;
	    }
	    for(int i=0;i<size;i++){
	        System.out.print(arr[i] + " ");
	    }
	}
}
