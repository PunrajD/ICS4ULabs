import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1) Say Hello");
            System.out.println("2) Say Goodbye");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("Goodbye!");
            }
        } while (choice != 3);
    }
}