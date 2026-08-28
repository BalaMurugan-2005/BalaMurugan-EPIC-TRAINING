package myfirstproject;

public class Pattern6 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n*2; j++) {
				if(j<=i || (i+j) >=(n*2)-1) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
        for(int i=0; i<n; i++) {
			
			for(int j=0; j<(n*2)-1; j++) {
				if(j==i || (i+j) == (n*3)-2) 
					System.out.print("* ");
				else
					System.out.print(" ");
				//System.out.print("(" + i + "," +j + ")"); //13 -2  , 11 -4 9  
			}
			System.out.println();
		}
	}
}
