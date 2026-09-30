import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 8, 7, 4, 25, 18, 17};
        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}
