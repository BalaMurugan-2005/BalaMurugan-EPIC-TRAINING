import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // FIXED: loop must start from 1 (not 0) and multiply — not add+multiply
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(num + "! = " + fact);
    }
}
