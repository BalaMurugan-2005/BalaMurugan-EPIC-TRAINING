import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int row = in.nextInt();
	    int col = in.nextInt();
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        arr1[i][j] = in.nextInt();
		    }
		}
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        arr2[i][j] = in.nextInt();
		    }
		}
		for(int i=0;i<row;i++){
		    int sum =0;
		    for(int j=0;j<col;j++){
		       arr1[i][j] =  arr1[i][j] + arr2[i][j];
		       System.out.print(arr1[i][j] + " ");
		       
		    }
		    
		    System.out.println();
		}
	}
}
