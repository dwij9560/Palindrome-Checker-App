public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Sample input string (you can modify this value)
        String originalString = "madam";

        // Variable to store reversed string
        String reversedString = "";

        // Reverse string using for loop
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        // Compare original and reversed string using equals()
        if (originalString.equals(reversedString)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
    }
}