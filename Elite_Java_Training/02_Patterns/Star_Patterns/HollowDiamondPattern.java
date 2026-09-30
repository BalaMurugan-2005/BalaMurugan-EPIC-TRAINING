// Hollow Diamond / Pyramid Pattern
public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        // Upper Hollow Pyramid
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - i) - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j == 0 || j == i * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Lower Inverted Hollow Pyramid
        for (int i = n - 2; i >= 0; i--) {
            for (int s = 0; s < (n - i) - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j == 0 || j == i * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
