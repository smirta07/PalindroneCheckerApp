public class UseCase10PalindromeCheckerApp {
    static boolean isPalindrome(String input) {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "a man a plan a canal panama";

        boolean result = isPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
