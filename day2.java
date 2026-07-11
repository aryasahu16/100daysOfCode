import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input position to delete (1-based)
        int pos = sc.nextInt();

        // Shift elements to the left
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print updated array
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}