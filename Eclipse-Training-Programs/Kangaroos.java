package myfirstproject;

public class Kangaroos {
	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int x1 =0;
		int v1 =3;
		int x2=4;
		int v2=2;
		int f1sum=0;
		int f2sum=0;
		for(int i=x1; i<arr.length-1; i++) {
			if(arr[i] < 0) {  
				i = i+1; 
			}
			//System.out.println(" first : " + arr[i]);
			i = arr[i+v1];
			f1sum +=arr[i];
			for(int j=x2; j<i+1; j++) {
				if(arr[j] < 0) {
					j = j+1;
				}
				System.out.println("second : "+ arr[j+1]);
				j = arr[j+v2 ];
				f2sum +=arr[j];
				
			}
			
		}
		System.out.println("Sum f1" + f1sum + "sum f2 "+f2sum);
	}
}
