import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[6];
        System.out.println("Enter 6 exam scores:");
        for (int i = 0; i < 6; i++) {
            scores[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / 6;
        int above = 0;
        int below = 0;
        for (double score : scores) {
            if (score > average) above++;
            else if (score < average) below++;
        }
        System.out.println("Average: " + average);
        System.out.println("Number above average: " + above);
        System.out.println("Number below average: " + below);
        scanner.close();
    }
}
