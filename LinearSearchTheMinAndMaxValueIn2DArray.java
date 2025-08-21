import java.util.Scanner;

public class LinearSearchTheMinAndMaxValueIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {
            {1, 2, 3},
            {4, 15, 6, 21},
            {7, 8, 9}
        }; 
        int minValue = findMinValue(a);
        System.out.println("The minimum value in the 2D array is: " + minValue);
        int maxValue = findMaxValue(a);
        System.out.println("The maximum value in the 2D array is: " + maxValue);
        sc.close();
    }
    static int findMaxValue(int[][] a) {
        int max = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > max) {
                    max = a[row][col]; // Update max if current element is greater
                }
            }
        }
        return max; // Return the maximum value found
    }

    static int findMinValue(int[][] a) {
        int min = Integer.MAX_VALUE; // Initialize to the largest possible integer
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] < min) {
                    min = a[row][col]; // Update min if current element is smaller
                }
            }
        }
        return min; // Return the minimum value found
    }
}
