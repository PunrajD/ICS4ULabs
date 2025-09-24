import java.util.Scanner;
import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        System.out.println("Enter 8 integers:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        ArrayList<Integer> maxIndices = new ArrayList<>();
        ArrayList<Integer> minIndices = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndices.clear();
                maxIndices.add(i);
            } else if (numbers[i] == max) {
                maxIndices.add(i);
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndices.clear();
                minIndices.add(i);
            } else if (numbers[i] == min) {
                minIndices.add(i);
            }
        }
        System.out.println("Largest value: " + max + " at indices: " + maxIndices);
        System.out.println("Smallest value: " + min + " at indices: " + minIndices);
        scanner.close();
    }
}
