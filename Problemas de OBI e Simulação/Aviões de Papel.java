import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int c = sc.nextInt();
            int p = sc.nextInt();
            int f = sc.nextInt();
            System.out.println(c * f <= p ? "S" : "N");
        }
        sc.close();
    }
}
