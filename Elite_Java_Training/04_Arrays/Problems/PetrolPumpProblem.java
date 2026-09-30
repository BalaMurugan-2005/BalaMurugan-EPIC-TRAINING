import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pic = in.nextInt();//2
		int n = in.nextInt();//3
		int[] dis = new int[n];//1 5 3
		int[] cap = new int[n];//6 4 2
		for(int i=0;i<n;i++){
		    dis[i] = in.nextInt();
		}
		for(int i=0;i<n;i++){
		    cap[i] = in.nextInt();
		}
		
		for(int i=0;i<n;i++){
		    pic-= dis[i];
		    pic+= cap[i];
		}
		System.out.println("The Petrol Remaining is: "+pic);
		
	}
}
