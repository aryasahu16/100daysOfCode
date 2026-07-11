import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input key to search
        int k = sc.nextInt();

        int comparisons = 0;
        int index = -1;

        // Linear Search
        for (int i = 0; i < n; i++) {
            comparisons++;
            if (arr[i] == k) {
                index = i;
                break;
            }
        }

        // Output
        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not Found");
        }

        System.out.println("Comparisons = " + comparisons);

        sc.close();
    }
}