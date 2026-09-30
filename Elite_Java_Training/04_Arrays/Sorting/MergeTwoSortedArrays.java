import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {2, 4, 7};
        int[] merged = merge(arr1, arr2);
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merged:  " + Arrays.toString(merged));
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merged = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < len1) {
            merged[k++] = arr1[i++];
        }
        while (j < len2) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
