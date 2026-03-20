import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {
     static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque approach
    static boolean dequePalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    // Recursion approach
    static boolean recursionPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursionPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "level";

        // Stack timing
        long start = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long stackTime = System.nanoTime() - start;

        // Deque timing
        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long dequeTime = System.nanoTime() - start;

        // Recursion timing
        start = System.nanoTime();
        boolean recursionResult = recursionPalindrome(input, 0, input.length() - 1);
        long recursionTime = System.nanoTime() - start;

        // Final result (all algorithms give same result)
        boolean finalResult = stackResult;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + finalResult);
        System.out.println();

        System.out.println("Stack Time : " + stackTime + " ns");
        System.out.println("Deque Time : " + dequeTime + " ns");
        System.out.println("Recursion Time : " + recursionTime + " ns");
    }
}
