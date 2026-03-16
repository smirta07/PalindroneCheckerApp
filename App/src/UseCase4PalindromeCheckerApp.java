public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {

        String text = "madam";

        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input text : " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
