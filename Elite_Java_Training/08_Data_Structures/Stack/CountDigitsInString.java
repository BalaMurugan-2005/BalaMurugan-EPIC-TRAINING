import java.util.Scanner;

class StackImpl {
    char[] stack = new char[20];
    int top = -1;

    void push(char val) {
        if (top >= stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = val;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack UnderFlow");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class CountDigitsInString {
    public static void main(String[] args) {
        StackImpl st = new StackImpl();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        System.out.println("Number of digits in the string: " + count);
    }
}
