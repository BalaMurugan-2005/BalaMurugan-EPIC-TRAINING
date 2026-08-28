package myfirstproject;

public class Pattern5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n; i++) {
			for( int s=0; s<(n-i)-1; s++)  //5-0-1
				System.out.print(" ");
			
			for(int j=0; j<i*2+1; j++) { 
				if(j==0 || i==n || i*2==j )//0*2+1 
					{
					System.out.print("*");
					}
				else {
					System.out.println(" ");
				}
				System.out.println();
		
				
			}
			System.out.println();
		}
		
		
	}
}
