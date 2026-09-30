import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int firstMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > firstMax) {
                firstMax = arr[i];
        }

        if (firstMax > k) {
            System.out.println(firstMax - k);
        } else {
            System.out.println(0);
        }
    }
    }
    }

