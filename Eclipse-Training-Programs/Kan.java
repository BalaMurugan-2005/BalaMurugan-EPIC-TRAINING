package myfirstproject;

public class Kan {
	public static void main(String[] args) {
		int x1 = 0;
		int v1 = 3;
		int x2 =4;
		int v2 = 2;		
		
		String Pointer = "Yes";
		for(int i=0;i<13; i++) {	
		
		if(x1 == x2) {
			Pointer ="Yes";
			break;
		}
		else {
			Pointer = "No";
		}
		x1= x1+v1; 
		x2 = x2+ v2;
		
		}
		System.out.println(Pointer);
		
	}
}
