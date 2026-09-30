import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int size =in.nextInt();
		for(int i=0;i<size;i++){
		    arr.add(in.nextInt());
		}
		
		//Reversearray
		
		int left =0;
		int right=arr.size()-1;
		while(left < right){
		    int temp = arr.get(left);
		    arr.set(left , arr.get(right));
		    arr.set(right , temp);
		    left++;
		    right--;
		}
		
		System.out.println(arr);
		
	}
}
