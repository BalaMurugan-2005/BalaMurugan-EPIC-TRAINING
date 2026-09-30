import java.util.Scanner;

/**
 * Character Shift Programs
 * FIXED: charecter2() used variable 'str' which was never declared in that method.
 * Now takes a Scanner parameter properly.
 */
public class CharacterShift {

    // Shift each character forward by 1 (z -> a)
    static void shiftForward(String value) {
        System.out.print("Shifted Forward: ");
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (ch == 'z') {
                System.out.print("a ");
                continue;
            }
            int val = ((int) ch) + 1;
            System.out.print((char) val + " ");
        }
        System.out.println();
    }

    // Shift each character by 1 in alphabet (cyclic, 1-indexed)
    // FIXED: was using undeclared variable 'str' — now receives input from Scanner
    static void shiftAlphabet(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int val = (str.charAt(i) - 97) + 1;   // 1-indexed position
            int shifted = ((val % 26) + 1) + 96;   // next letter, cyclic
            result += (char) shifted;
        }
        System.out.println("Shifted Alphabet: " + result);
    }

    public static void main(String[] args) {
        // Demo of shiftForward
        String demo1 = "zbazlazzzkah";
        shiftForward(demo1);

        // Demo of shiftAlphabet with user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string to shift: ");
        String input = sc.nextLine();
        shiftAlphabet(input);
        sc.close();
    }
}
