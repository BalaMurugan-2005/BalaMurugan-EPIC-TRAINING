import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row=3;
		int col=3;
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        arr[i][j]=in.nextInt();
		    }
		}
		boolean rightangle =false;
		boolean leftangle = false;
		boolean notanyangle = false;
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        if(arr[i][j] < arr[j][i]){
		            if(arr[i][j]==0){
		                rightangle=true;
		            }
		        }
		        else if(arr[i][j] > arr[j][i]){
		            if(arr[i][j]==0){
		                leftangle = true;
		            }
		        }
		        else{
		            notanyangle=true;
		        }
		    }
		}
		
		if(rightangle){
		    System.out.print("It was a right angle");
		}
		else if(leftangle){
		    System.out.println("it was a leftangle");
		}
		else{
		    System.out.println("It was not have any triangles");
		}
		
	}
}