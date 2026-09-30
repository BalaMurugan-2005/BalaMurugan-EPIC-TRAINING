package myfirstproject;

public class Pattern7 {
	public static void main(String[] args) {
		int n=15;
		for(int i=0; i<=n/2; i++) {
			for(int s=0; s<=i; s++) {
				System.out.print("  ");
			}
			for(int j =0; j<(n-(i*2)); j++) {
				System.out.print(j+1+ " ");
			}
			System.out.println();
		}
		
		for(int i=(n/2)-1; i>=0; i--) {
			for(int s=0; s<=i; s++) {
				System.out.print("  ");
			}
			for(int j =(n-(i*2)); j>0; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}