import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		int slow=0;
		Collections.sort(arr);
		for(int fast =0;fast<arr.size();fast++){
		    if(!arr.get(slow).equals(arr.get(fast))){
		        slow++;
		        arr.set(slow,arr.get(fast));
		    }
		}
		for(int i=0;i<=slow;i++){
		    System.out.println(arr.get(i));
		}
	}
}
