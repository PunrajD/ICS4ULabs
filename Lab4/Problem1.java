import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numbers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // Extension: Sum of numbers at even indices
        int sumEvenIndices = 0;
        for (int i = 0; i < 10; i += 2) {
            sumEvenIndices += numbers[i];
        }
        System.out.println("Sum of numbers at even indices: " + sumEvenIndices);
        scanner.close();
    }
}
