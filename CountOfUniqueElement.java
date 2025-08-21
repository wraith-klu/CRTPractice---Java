import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CountOfUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int newArray[] = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArray[index++] = num;
        }

        System.out.println("Unique elements in the array: " + Arrays.toString(newArray));
        sc.close();
    }
}
