import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int h = sc.nextInt();
            int z = sc.nextInt();
            int l = sc.nextInt();
            if (h < z && h < l) {
                System.out.println("huguinho");
            } else if (z < h && z < l) {
                System.out.println("zezinho");
            } else {
                System.out.println("luisinho");
            }
        }
        sc.close();
    }
}
