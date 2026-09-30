package myfirstproject;
import java.util.*;
public class P2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 1000000001 1000000002 1000000003 1000000004 1000000005
        int size = in.nextInt();
        long[] arr= new long[size];
        long sum = 0;
        for(int i=0; i<size; i++) {
        	arr[i] = in.nextLong();
        	sum +=arr[i];
        
        }
        
        System.out.println(sum);
	}
}
