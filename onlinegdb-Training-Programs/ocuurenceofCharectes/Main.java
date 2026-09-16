public class Main {
    public static void main(String[] args) {

        String str = "saravana";

        for (int i = 0; i < str.length(); i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " count = " + count);
        }
    }
}