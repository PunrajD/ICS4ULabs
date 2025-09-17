import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter day: ");
            int day = scanner.nextInt();
            
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            boolean valid = false;
            
            if (month >= 1 && month <= 12) {
                int[] daysInMonth = {31, isLeap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if (day >= 1 && day <= daysInMonth[month - 1]) {
                    valid = true;
                }
            }
            
            if (valid) {
                System.out.println("Valid date.");
            } else {
                System.out.println("Invalid date.");
            }
        }
    }
}
