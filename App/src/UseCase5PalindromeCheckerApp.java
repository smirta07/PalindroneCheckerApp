import java.util.Stack;
public class UseCase5PalindromeCheckerApp {
     public static void main(String[] args) {

        String text = "madam";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input text : " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
