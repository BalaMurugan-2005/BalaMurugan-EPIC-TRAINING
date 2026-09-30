/**
 * Kangaroo Problem (HackerRank)
 * FIXED: Original (Kangaroos.java) used array-index arithmetic with wrong logic.
 * Correct solution: two kangaroos meet if x1+v1*t == x2+v2*t for some t >= 0.
 * Equivalently: (x2-x1) must be divisible by (v1-v2) and quotient >= 0.
 */
public class KangarooProblemV2 {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            return (x1 == x2) ? "YES" : "NO";
        }
        if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(kangaroo(0, 3, 4, 2));   // YES — they meet at t=4
        System.out.println(kangaroo(0, 2, 5, 3));   // NO
        System.out.println(kangaroo(0, 4, 4, 2));   // YES — start at same, same pace won't meet... wait
        System.out.println(kangaroo(10, 2, 0, 3));  // NO — faster is behind and slower is ahead
    }
}
