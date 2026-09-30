package myfirstproject;

public class Pattern {
	public static void main(String[] args) {
		int n=5;
		int sumJ = 0;
		for(int i=0; i<n; i++) {  //i=0  0<4 true
 			for(int j=0; j<n; j++) {  // j =0 0< 0+1  1+1 3
				System.out.print("*"); //*****
				sumJ +=1;             //*****
			}
			System.out.println();
			
		}
		System.out.println(sumJ);
	}
}
