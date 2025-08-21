import java.util.Scanner;

public class ToGetTheMiddleNumbersFromTheGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int nLength = String.valueOf(n).length();

        int z = n % (int)(Math.pow(10, nLength-1));

        int result = z/10;
        System.out.println("The middle number is: " + result);
        sc.close();
    }
}