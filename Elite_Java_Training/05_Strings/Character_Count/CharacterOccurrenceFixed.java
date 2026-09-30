import java.util.Scanner;

/**
 * Character Occurrence Count
 * FIXED: Original file had ALL code inside block comments — nothing ran.
 * This is the clean, working version extracted from those comments.
 */
public class CharacterOccurrenceFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        // Count occurrences (handles both upper and lower case)
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        System.out.println("\nCharacter Occurrences:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (ch >= 'A' && ch <= 'Z') ? ch - 'A' : ch - 'a';
            if (idx >= 0 && idx < 26 && count[idx] > 0) {
                System.out.println(Character.toLowerCase(ch) + " = " + count[idx]);
                count[idx] = 0;  // Print each char only once
            }
        }

        // Reset and find distinct characters
        int[] count2 = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') count2[ch - 'a']++;
        }
        System.out.println("\nDistinct characters (appear only once):");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && count2[ch - 'a'] == 1) {
                System.out.println(ch);
                count2[ch - 'a'] = 0;
            }
        }
        in.close();
    }
}
