import java.math.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num =in.nextInt();
	    BigInteger fact = BigInteger.ONE;
	    
	    for(int i=0;i<num;i++){
	       fact = fact.add(fact.multiply(BigInteger.valueOf(i)));
	    }
	    System.out.println(fact);
	}
}
