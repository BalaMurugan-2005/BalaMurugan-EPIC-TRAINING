import java.util.*;


public class ReverseStringStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        char[] stack = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            top++;
            stack[top] = str.charAt(i);
        }

        System.out.print("Reversed: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i]);
        }
        System.out.println();
    }
}
