import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String s = sc.nextLine();

        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}