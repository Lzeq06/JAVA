import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int[] l = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
            Arrays.sort(l);
            int a = l[0], b = l[1], c = l[2];
            if (a + b <= c) {
                System.out.println("n");
            } else if (a * a + b * b == c * c) {
                System.out.println("r");
            } else if (a * a + b * b > c * c) {
                System.out.println("a");
            } else {
                System.out.println("o");
            }
        }
        sc.close();
    }
}
