import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first side: ");
            int a = scanner.nextInt();
            System.out.print("Enter second side: ");
            int b = scanner.nextInt();
            System.out.print("Enter third side: ");
            int c = scanner.nextInt();
            
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Valid triangle.");
                if (a == b && b == c) {
                    System.out.println("Equilateral triangle.");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles triangle.");
                } else {
                    System.out.println("Scalene triangle.");
                }
            } else {
                System.out.println("Invalid triangle.");
            }
        }
    }
}
