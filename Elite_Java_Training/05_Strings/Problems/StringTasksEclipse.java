import java.util.*;

/**
 * String Tasks from Eclipse
 * FIXED: Original had field assignments and loops at class body level
 * (outside any method) which is illegal in Java.
 * All code is now properly wrapped inside methods.
 */
public class StringTasksEclipse {

    // Task p1: Count character occurrences
    static void charOccurrence() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] visited = new boolean[str.length()];
        System.out.println("Character occurrences:");
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(str.charAt(i) + "=" + count);
        }
    }

    // Task p2: Replace vowels with '$'
    static void replaceVowels() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) >= 0) {
                result += "$";
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }

    // Task p3: Replace consonants with '#'
    static void replaceConsonants() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) < 0) {
                result += "#";
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose task:\n1) Char Occurrence\n2) Replace Vowels\n3) Replace Consonants");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1: charOccurrence();    break;
            case 2: replaceVowels();     break;
            case 3: replaceConsonants(); break;
        }
    }
}
