
public class LookAndSayFixed {
    public static void main(String[] args) {
        String current = "1";
        System.out.println(current);

        for (int t = 0; t < 9; t++) {
            String next = "";
            int i = 0;
            while (i < current.length()) {
                char ch = current.charAt(i);
                int count = 1;
                while (i + count < current.length() && current.charAt(i + count) == ch) {
                    count++;
                }
                next += count + "" + ch;
                i += count;
            }
            current = next;
            System.out.println(current);
        }
    }
}
