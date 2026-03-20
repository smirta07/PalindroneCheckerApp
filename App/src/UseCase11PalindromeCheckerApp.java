import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class (Encapsulation + Single Responsibility)
class PalindromeChecker {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String input) {

        // Normalize string (remove spaces & convert to lowercase)
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < cleanInput.length(); i++) {
            stack.push(cleanInput.charAt(i));
        }

        // Compare characters while popping
        for (int i = 0; i < cleanInput.length(); i++) {
            if (cleanInput.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application Class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object (Encapsulation)
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println("Result: The string IS a palindrome ");
        } else {
            System.out.println("Result: The string is NOT a palindrome ");
        }

        scanner.close();
    }
}