import java.util.Scanner;  // FIXED: Scanner import was missing

/**
 * Array Problems (Search, Duplicates, Occurrence Count)
 * FIXED: Missing "import java.util.Scanner;" in original
 */
class Program {

    // p1: Linear search for target
    void p1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        int target = 4;
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                System.out.print("Target " + target + " Found");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Target " + target + " Not Found");
    }

    // p2: Find and print duplicates
    void p2() {
        int[] arr = {12, 5, 4, 6, 6, 7, 12, 4, 7, 5, 7};
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    // p3: Count occurrences of each element
    void p3() {
        int[] arr = {4, 5, 3, 4, 5, 6, 6};
        for (int i = 0; i < arr.length; i++) {
            int found = 1;
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) { alreadyCounted = true; break; }
            }
            if (alreadyCounted) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) found++;
            }
            System.out.println(arr[i] + " occurs " + found + " time(s)");
        }
    }
}

public class ArrayProblems {
    public static void main(String[] args) {
        Program p = new Program();
        System.out.println("--- p1: Linear Search ---");
        p.p1();
        System.out.println("--- p2: Find Duplicates ---");
        p.p2();
        System.out.println("--- p3: Occurrence Count ---");
        p.p3();
    }
}
