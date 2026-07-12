import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("NO");
                return;
            }
            left++;
            right--;
        }

        System.out.println("YES");
    }
}