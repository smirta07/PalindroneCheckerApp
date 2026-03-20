import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            queue.add(ch);     
            stack.push(ch);    
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text : " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

    }
}