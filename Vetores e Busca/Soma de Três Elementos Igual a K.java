import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int l = j + 1; l < n; l++) {
                        if (v[i] + v[j] + v[l] == k) {
                            System.out.println("SIM");
                            sc.close();
                            return;
                        }
                    }
                }
            }
            System.out.println("NAO");
        }
        sc.close();
    }
}
