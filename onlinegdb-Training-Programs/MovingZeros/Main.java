import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int pos =0;
		int size=in.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++){
		    arr[i] = in.nextInt();
		}
		for(int i=0;i<size;i++){
		    if(arr[i]!=0){
		        int temp=arr[i];
		        arr[i] = arr[pos];
		        arr[pos] = temp;
		        pos++;
		    }
		}
		for(int data : arr){
		    System.out.println(data);
		}
	}
}