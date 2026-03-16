public class UseCase2PalindromeCheckerApp {
           public static void main(String[] args) {
                    String text = "madam";
                    int length = text.length();
                    boolean isPalindrome = true;

                    for (int i = 0; i < length / 2; i++) {
                        if (text.charAt(i) != text.charAt(length - 1 - i)) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    System.out.println("Input text : " + text);
                    System.out.println("Is it a Palindrome? : " + isPalindrome);

                }
            
}
