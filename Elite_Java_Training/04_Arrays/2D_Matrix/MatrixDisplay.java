import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col=in.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        arr[j][i]=in.nextInt();
		    }
		}
		System.out.println();
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
// 		System.out.println();
// 		for(int i=0;i<row;i++){
// 		    for(int j=0;j<col;j++){
// 		        System.out.print(arr[j][i] + " ");
// 		    }
// 		    System.out.println();
// 		}
// 		void reverseMatrix(){
		    
// 		Scanner in = new Scanner(System.in);
// 		int row = in.nextInt();
// 		int col=in.nextInt();
// 		int[][] arr = new int[row][col];
// 		for(int i=0; i<row; i++) {
// 			for(int j=0; j<col; j++) {
// 				arr[i][j]=in.nextInt();
// 			}
// 		}
// 		System.out.println();
// 		for (int i = row - 1; i >= 0; i--) {
// 			for (int j = col - 1; j >= 0; j--) {
// 				System.out.print(arr[i][j] + " ");
// 			}
// 			System.out.println();
		
// 	}
// 		}
	}
}