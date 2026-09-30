import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {

            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == arr[i]) {
                    count1++;
                }

                if (arr[j] == arr[i] + 1) {
                    count2++;
                }
            }

            int total = count1 + count2;

            if (total > result) {
                result = total;
            }
        }

        System.out.println(result);
    }
}