import java.util.*;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: "); 
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the target element to search: ");   
        int target = sc.nextInt();

        int[] result = linearSearch(a, target);
        System.out.println("Element found at index: " + Arrays.toString(result));
        sc.close();
    }
    
    static int[] linearSearch(int[][] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    return new int[]{i,j}; // Return index as an array
                }
            }
        }
        return new int[]{-1,-1}; // Target not found
    }   
}
