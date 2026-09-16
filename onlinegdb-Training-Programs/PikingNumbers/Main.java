import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = in.nextInt();
		}
		for(int i=0; i<size; i++) {
			int count=0;
			for(int j=i; j<size; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println("i = "+ arr[i] +"j =" + count );
		}
	}
}