package myfirstproject;
import java.util.*;
public class Array1 {
	public static void main(String[] args) {
        int[] arr = {1,1,0,-1,-1};        
        int pos = 0;
        int neg = 0;  
        int zero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                neg+=1;
            }
            else if(arr[i] > 0){
                pos +=1;
            }
            else{
                zero+=1;
            }   
        }
        System.out.println((double)pos/arr.length); 
        System.out.println ((float)neg/arr.length);
        System.out.println((float)zero/arr.length);
        System.out.println((double)pos/5);
		}
}