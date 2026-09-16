import java.util.*;
class Task{
    void p1(){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(str.charAt(i) + "=" + count);
        }
        void p2(){
            Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
                result += "$";
            } else {
                result += ch;
            }
        }

        System.out.println(result);
        }
    }
}