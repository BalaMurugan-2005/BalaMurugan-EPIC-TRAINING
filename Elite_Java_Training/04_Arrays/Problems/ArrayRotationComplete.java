import java.util.Arrays;
import java.util.Scanner;

/**
 * Array Rotation
 * FIXED: Original was empty stub — only had imports and empty main
 * This is a complete left-rotation implementation.
 */
public class ArrayRotationComplete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) arr[i] = in.nextInt();
        System.out.print("Enter number of rotations (k): ");
        int k = in.nextInt() % size;

        System.out.println("Original: " + Arrays.toString(arr));

        // Left rotate k times
        for (int r = 0; r < k; r++) {
            int first = arr[0];
            for (int i = 0; i < size - 1; i++) arr[i] = arr[i + 1];
            arr[size - 1] = first;
        }

        System.out.println("After left rotation by " + k + ": " + Arrays.toString(arr));
        in.close();
    }
}
