import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        double avg = (double) sum / 10;
        System.out.println("Max: " + max + ", Min: " + min + ", Average: " + avg);
    }
}