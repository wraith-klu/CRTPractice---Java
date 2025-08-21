import java.util.Scanner;

public class ReverseTheDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversedNumber = 0;
        while (n != 0) {
            int rem = n % 10; 
            reversedNumber = reversedNumber * 10 + rem;
            n /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
        sc.close();
    }
}
