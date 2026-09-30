import java.util.*;

public class Main
{
    public static void main(String[] args) {

        String str = "helloworld";
        String substr = "world";
        int k = substr.length();

        for(int i = k; i < str.length()+1; i++) {
            String sb = str.substring(i-k,i);
            System.out.println(sb);
            System.out.println(i-k + " " + (i));
            if(substr.equals(sb)){
                System.out.println("It was Substring " + (i-k) + "," + i );
            }
        }
    }
}