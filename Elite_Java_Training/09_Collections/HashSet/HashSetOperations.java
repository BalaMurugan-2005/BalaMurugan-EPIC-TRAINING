import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
class Programs {
	void p1() {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		List<Integer> li = new ArrayList<>();
		//10 20 10 20 10 20 30 40
		for(int i=0; i<n; i++) {
			li.add(in.nextInt());
		}

		HashSet<Integer> set = new HashSet<>();
		for(int val : li) {

			if(!set.add(val)) {  //[10] - t -f
				set.remove(val);
			}
		}
		System.out.println(set);
		// 		set.add(1);
		// 		set.add(2);
		// 		set.add(1);
		// 		System.out.println(set.add(1));
		// 		System.out.println(set.add(1));
	}
	void distint() {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		List<Integer> li = new ArrayList<>();
		//10 20 10 20 10 20 30 40
		for(int i=0; i<n; i++) {
			li.add(in.nextInt());
		}
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for(int val : li) {
			if(!set.add(val)) {
				set2.add(val);
			}
		}
		System.out.println(set2);
		li.removeAll(set2);
		System.out.println(li);
	}
}
public class Main
{
	public static void main(String[] args)
	{
// 		HashMap<String,Integer> map = new HashMap<>();
// 		String str="101101000011111";
		
	}
}
