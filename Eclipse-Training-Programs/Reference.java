package myfirstproject;

import java.util.Arrays;
import java.util.*;
class MyTools{
	class ToPointer{
		void ReverseArray() {
			Scanner in = new Scanner(System.in);
		    System.out.println("Enter The Size of an array");
		   int SIZE = in.nextInt();
		   int arr[] = new int[SIZE];
		   for(int i=0; i<SIZE; i++) {
			   arr[i] = in.nextInt();
		   }
			int left =0;
			int right = arr.length -1;
			while(left < right) {
				int temp = arr[right];    
				arr[right] = arr[left];
				arr[left]  =temp;
				left++;
				right--;
			}
		   System.out.println(Arrays.toString(arr));
	    }
		void Palindrome() {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter The String : ");
			String str = in.nextLine();
			int left =0;
			int right = str.length() -1;
			boolean palindrome = true;
			while(left < right) {
				if(str.charAt(left) != str.charAt(right)){
					palindrome = false;
					break;
				}
				left++;
				right--;
			}
			if(palindrome) {
				System.out.println("It was Palindrome");
			}
			else {
				System.out.println("It was Not a palindrome");
			}
		}
		void MoveallZeros_to_end(){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter The Size Of the Array");
			int SIZE = in.nextInt();
			int[] arr = new int[SIZE];
			int slow = 0;
			for(int i=0; i<SIZE; i++) {
				arr[i] = in.nextInt();
			}
			for(int fast =0; fast<arr.length; fast++) {
				
				if(arr[fast] !=0) {
					int temp = arr[slow];
					arr[slow] = arr[fast];
					arr[fast] = temp;
					slow++;	
				}	
			}
			System.out.println(Arrays.toString(arr));
		}
		void reveserString() {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter The String ");
			
			String str = in.nextLine();
			char[] strArray = str.toCharArray();
			int left =0;
			int right = strArray.length -1;
		}
		void Two_Sum() {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter The Array Size");
			
			int SIZE =in.nextInt();
			int[] arr  = new int[SIZE];
			
			for(int i=0; i< SIZE; i++) {
				arr[i] = in.nextInt();
			}
			int target =9;
			int left = 0;
			int right = arr.length -1;
			
			while(left < right) {
				int sum = arr[left] + arr[right];
				if(sum == target) {
					System.out.println("[" + arr[left] + ","+ arr[right] + "]" + " --> 9");
				}
				if(sum < target) {
					left++;
				}
				else {
					right--;
				}
				
			}
			
		}
	}
}


public class Reference {
	public static void main(String[] args) {
		
		MyTools rev = new MyTools();
		MyTools.ToPointer tp = rev.new ToPointer();
		tp.Two_Sum();
	}
}
