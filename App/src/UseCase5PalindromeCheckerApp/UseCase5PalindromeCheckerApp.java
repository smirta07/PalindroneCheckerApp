package UseCase5PalindromeCheckerApp;
import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}
