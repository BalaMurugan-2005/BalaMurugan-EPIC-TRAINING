import java.util.*;
class Task {
	void p1() {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.length() == s2.length()) {
			System.out.println("Equal");
		}
		else if(s1.equals(s2)) {
			System.out.println("String Equasl");
		}

	}
	void p2() {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String copy = "";

		for (int i = 0; i < input.length(); i++) {
			copy = copy + input.charAt(i);
		}

		System.out.println(copy);
	}
	void p3() {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch) &&
			        !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
			          ch == 'O' || ch == 'U')) {
				result += "#";
			} else {
				result += ch;
			}
		}

		System.out.println(result);
	}
}
