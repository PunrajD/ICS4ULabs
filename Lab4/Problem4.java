import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[len - 1 - i])) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
        scanner.close();
    }
}
