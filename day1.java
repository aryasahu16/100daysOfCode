// Problem: Write a C program to insert an element x at a given 1-based position pos in an array of n integers. Shift existing elements to the right to make space.

// Input:
// - First line: integer n
// - Second line: n space-separated integers (the array)
// - Third line: integer pos (1-based position)
// - Fourth line: integer x (element to insert)

// Output:
// - Print the updated array (n+1 integers) in a single line, space-separated

// Example:
// Input:
// 5
// 1 2 4 5 6
// 3
// 3

// Output:
// 1 2 3 4 5 6

// Explanation: Insert 3 at position 3, elements [4,5,6] shift right


import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input position (1-based) and element to insert
        int pos = sc.nextInt();
        int x = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[pos - 1] = x;

        // Print updated array
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}