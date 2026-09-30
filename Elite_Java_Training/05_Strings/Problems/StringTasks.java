import java.util.Scanner;

/**
 * String Tasks (Combined & Fixed)
 * Fixed: Original had p2()-p5() defined INSIDE p1() body (illegal in Java).
 * Fixed: task345 had no public class / main method.
 * All methods are now proper class-level methods called from main().
 */
public class StringTasks {

    // Task: Print each character with a space between them
    static void printCharsSpaced(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    // Task: Print length of string
    static void printLength(String s) {
        System.out.println("Length: " + s.length());
    }

    // Task: Find if character 'e' exists in the string
    static void findChar(String s) {
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                System.out.println("Found 'e' at index " + i);
                found = true;
            }
        }
        if (!found) System.out.println("'e' Not Found");
    }

    // Task: Concatenate two strings
    static void concatenate(String s1, String s2) {
        System.out.println("Concatenated: " + s1 + s2);
    }

    // Task: Reverse the string
    static void reverse(String s) {
        System.out.print("Reversed: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    // Task: Count occurrences of each character (no HashMap)
    static void charCount(String str) {
        boolean[] visited = new boolean[str.length()];
        System.out.println("Character counts:");
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(str.charAt(i) + " = " + count);
        }
    }

    // Task: Replace vowels with '$'
    static void replaceVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) >= 0) {
                result += "$";
            } else {
                result += ch;
            }
        }
        System.out.println("Vowels replaced: " + result);
    }

    // Task: Replace consonants with '#'
    static void replaceConsonants(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) < 0) {
                result += "#";
            } else {
                result += ch;
            }
        }
        System.out.println("Consonants replaced: " + result);
    }

    // Task: Compare two strings by length and content
    static void compareStrings(String s1, String s2) {
        if (s1.length() == s2.length()) System.out.println("Lengths are Equal");
        if (s1.equals(s2)) System.out.println("Strings are Equal");
        else System.out.println("Strings are NOT equal");
    }

    // Task: Copy a string character by character
    static void copyString(String input) {
        String copy = "";
        for (int i = 0; i < input.length(); i++) {
            copy += input.charAt(i);
        }
        System.out.println("Copy: " + copy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        printCharsSpaced(str);
        printLength(str);
        findChar(str);
        reverse(str);
        charCount(str);
        replaceVowels(str);
        replaceConsonants(str);
        copyString(str);

        System.out.println("\nEnter second string for concatenation/compare:");
        String str2 = sc.nextLine();
        concatenate(str, str2);
        compareStrings(str, str2);

        sc.close();
    }
}
