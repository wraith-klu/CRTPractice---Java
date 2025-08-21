import java.util.Scanner;

public class ReverseRightAngleTrangleHollowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (j == 0 || i == n - 1 || i == 0 || j == n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
