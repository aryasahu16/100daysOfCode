import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String str = sc.nextLine();

        // Print characters in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}