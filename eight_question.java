// Create a program to check if a given string is a palindrome.

public class eight_question {
    public static void main(String[] args) {
        String str = "radar"; // Test string
        
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
    
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for better comparison
        str = str.toLowerCase().replaceAll("\\s+", "");
        
        int left = 0;
        int right = str.length() - 1;
        
        // Compare characters from both ends moving towards center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}