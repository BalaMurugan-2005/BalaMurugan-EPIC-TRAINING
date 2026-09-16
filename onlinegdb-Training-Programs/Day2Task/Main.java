import java.util.*;
class Task {
	void p1() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		void p2() {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println(s.length());
		}
		void p3() {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			char ch = sc.next().charAt(0);
			for(int i=0;i<s.length();i++){
			if (s.chatAt(i) == 'e')
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
		void p4() {
			Scanner sc = new Scanner(System.in);

			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			System.out.println(s1 + s2);
		}
		void p5() {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();

			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}
	}
	public class Main
	{
		public static void main(String[] args) {

		}
	}