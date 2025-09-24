import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[12];
        System.out.println("Enter 12 integers:");
        for (int i = 0; i < 12; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Pairs that sum to 20:");
        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                if (numbers[i] + numbers[j] == 20) {
                    System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
                }
            }
        }
        scanner.close();
    }
}
