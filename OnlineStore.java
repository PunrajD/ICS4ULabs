import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose category: 1. Electronics, 2. Clothing, 3. Books");
            int choice = scanner.nextInt();
            
            double basePrice = switch (choice) {
                case 1 -> 100.0; // Electronics
                case 2 -> 50.0;  // Clothing
                case 3 -> 20.0;  // Books
                default -> {
                    System.out.println("Invalid choice.");
                    yield 0.0;
                }
            };
            
            if (basePrice == 0.0) return;
            
            double discount = switch (choice) {
                case 1 -> 0.10; // 10% off Electronics
                case 2 -> 0.20; // 20% off Clothing
                case 3 -> 0.05; // 5% off Books
                default -> 0.0;
            };
            
            double finalPrice = basePrice * (1 - discount);
            System.out.println("Final price: $" + finalPrice);
        }
    }
}
