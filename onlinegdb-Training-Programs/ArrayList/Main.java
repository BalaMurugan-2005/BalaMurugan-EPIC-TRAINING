import  java.util.*;
class Learining {
	void p1() {
		ArrayList<Integer> li = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0; i<n; i++) {
			li.add(in.nextInt());
		}
		System.out.println(li.contains(10));
	}
	void Checking_Duplicates_In_ArrayList() {
		ArrayList<Integer> li = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0; i<n; i++) {
			li.add(in.nextInt());
		}
		for(int i=0; i<n;) {
			if(li.contains(li.get(i)) && li.indexOf(li.get(i)) !=i) {
				li.remove(i);
				n--;
			}
			else {
				i++;
			}
		}
		System.out.println(li);
	}
	void secondmax_in_arrayList() {
		ArrayList<Integer> li = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int firstmax=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			li.add(in.nextInt());
		}
		for(int i=0; i<n; i++) {
			if(firstmax < li.get(i)) {
				secondmax = firstmax;
				firstmax = li.get(i);
			}
			else if(li.get(i) < firstmax && li.get(i)>secondmax) {
				secondmax = li.get(i);
			}
		}
		System.out.println(firstmax);
		System.out.println(secondmax);
	}
	void Problemsum(){
	    Scanner in = new Scanner(System.in);
		String str = in.nextLine();//p@j7$k2i61a
		List<Character> num = new ArrayList<>();
		List<Character> alp = new ArrayList<>();
		for(int i=0;i<str.length();i++){
		    if(Character.isDigit(str.charAt(i))){
		       num.add(str.charAt(i));
		    }
		    else if(Character.isLetter(str.charAt(i))){
		        alp.add(str.charAt(i));
		    }
		    
		}
		Collections.sort(num);
		Collections.reverse(alp);
		String emp="";
		int alpInd=0,numInd=0;
		for(int i=0;i<str.length();i++){
		    if(Character.isDigit(str.charAt(i))){
		       emp+=num.get(numInd);
		        numInd++;
		    }
		    else if(Character.isLetter(str.charAt(i))){
		        emp+=alp.get(alpInd);
		        alpInd++;
		    }
		    else{
		        emp+=str.charAt(i);
		    }
		}
		
		System.out.println(emp);
	}
}
public class Main {
	public static void main(String[] args) {
		
	}
}