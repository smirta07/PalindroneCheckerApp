public class UseCase3PalindromeCheckerApp {
     public static void main(String[] args) {

        String text = "madam";
        String reversed = "";

        // Reverse the string using a loop
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Compare original and reversed string
        boolean isPalindrome = text.equals(reversed);

        // Display result
        System.out.println("Input text : " + text);
        System.out.println("Reversed text : " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

    }
}
