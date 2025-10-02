import java.util.Arrays;
import java.util.Scanner;

public class SearchComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        long startTime = System.nanoTime();
        int linearIndex = linearSearch(array, target);
        long linearTime = System.nanoTime() - startTime;
        System.out.println("Linear search result: " + (linearIndex != -1 ? "Found at index " + linearIndex : "Not found") + " in " + linearTime + " ns");

        startTime = System.nanoTime();
        int binaryIndex = Arrays.binarySearch(array, target);
        long binaryTime = System.nanoTime() - startTime;
        System.out.println("Binary search result: " + (binaryIndex >= 0 ? "Found at index " + binaryIndex : "Not found") + " in " + binaryTime + " ns");

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}