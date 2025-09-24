import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!password.equals("JavaRocks"));
        System.out.println("Access granted!");
    }
}