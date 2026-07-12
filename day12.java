import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
sc.close();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Input matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Check if square matrix
        if (m != n) {
            System.out.println("Not a Symmetric Matrix");
            return;
        }

        // Check symmetry
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("Not a Symmetric Matrix");
                    return;
                }
            }
        }

        System.out.println("Symmetric Matrix");
    }
}