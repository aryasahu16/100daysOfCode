// Problem: Given a sorted array of n integers, remove duplicates in-place. Print only unique elements in order.

// Input:
// - First line: integer n
// - Second line: n space-separated integers (sorted array)

// Output:
// - Print unique elements only, space-separated

// Example:
// Input:
// 6
// 1 1 2 2 3 3

// Output:
// 1 2 3

// // Explanation: Keep first occurrence of each element: 1, 2, 3
import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the first element
        System.out.print(arr[0] + " ");

        // Print only unique elements
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}