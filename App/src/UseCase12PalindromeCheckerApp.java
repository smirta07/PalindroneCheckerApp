import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : cleanInput.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : cleanInput.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : cleanInput.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set!");
        }
        return strategy.isPalindrome(input);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("=== Palindrome Checker (Strategy Pattern) ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1/2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setStrategy(new StackStrategy());
                break;
            case 2:
                context.setStrategy(new DequeStrategy());
                break;
            default:
                System.out.println("Invalid choice! Using default Stack Strategy.");
                context.setStrategy(new StackStrategy());
        }

        boolean result = context.check(input);

        if (result) {
            System.out.println("Result: The string IS a palindrome ✅");
        } else {
            System.out.println("Result: The string is NOT a palindrome ❌");
        }

        scanner.close();
    }
}