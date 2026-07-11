import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first sorted array
        int p = sc.nextInt();
        int[] arr1 = new int[p];

        for (int i = 0; i < p; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second sorted array
        int q = sc.nextInt();
        int[] arr2 = new int[q];

        for (int i = 0; i < q; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merged array
        int[] merged = new int[p + q];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < p && j < q) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1
        while (i < p) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < q) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // Print merged array
        for (int x = 0; x < p + q; x++) {
            System.out.print(merged[x] + " ");
        }

        sc.close();
    }
}