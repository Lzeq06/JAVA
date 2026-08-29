import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] ent = new int[n + 1][n + 1];
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                ent[x][y] = z;
                ent[y][x] = z;
            }
            int maiorSoma = -1;
            int m1 = 1, m2 = 2, m3 = 3;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        int soma = ent[i][j] + ent[i][k] + ent[j][k];
                        if (soma > maiorSoma) {
                            maiorSoma = soma;
                            m1 = i; m2 = j; m3 = k;
                        }
                    }
                }
            }
            System.out.println(m1 + " " + m2 + " " + m3);
        }
        sc.close();
    }
}
