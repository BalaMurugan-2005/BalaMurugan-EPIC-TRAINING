package myfirstproject;

class Pattern1{
	void p1() {
		int n =7;
	    for(int i=0; i<n; i++) {
	    	for(int j =1; j<i+2; j++) {
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    }
	}
	void p2() {
		int n=7;
	    for(int i=0; i<n; i++) {
	    	for(int j =1; j<n-i + 1; j++) { // 1 7
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    }
	}
	void p3() {
		int n=5;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void p4() {
		int n=5;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void p5() {
		
	}
}
public class TrainingCode{
	public static void main(String[] args) {
		int n =5;
		for(int i=0; i<n; i++) {
			for(int j=65; j<70; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
	}
}
