import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int c = sc.nextInt();
            String s = sc.hasNext() ? sc.next() : "";
            int paineis = 0;
            int len = Math.min(c, s.length());
            for (int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                if (ch == 'P' || ch == 'C') paineis += 2;
                else if (ch == 'A') paineis += 1;
            }
            System.out.println(paineis);
        }
        sc.close();
    }
}
