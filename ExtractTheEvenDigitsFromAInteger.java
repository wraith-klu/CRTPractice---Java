import java.util.Scanner;

public class ExtractTheEvenDigitsFromAInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int evenDigits = 0;
        int z = 0;
        while (n != 0) {
            int rem = n % 10; 
            if (rem % 2 == 0) {
                int y = (int) Math.pow(10, z);
                evenDigits = evenDigits  + (rem*y);
                z++;
            }
            n /= 10;
        }
        System.out.println("Even digits in the given Number: " + evenDigits);
        sc.close();
    }
}
