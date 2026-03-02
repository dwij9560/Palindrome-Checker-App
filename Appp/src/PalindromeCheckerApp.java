import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Take input
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Convert String to char array
                char[] characters = input.toCharArray();

                // Two-pointer technique
                int start = 0;
                int end = characters.length - 1;

                boolean isPalindrome = true;

                while (start < end) {

                    if (characters[start] != characters[end]) {
                        isPalindrome = false;
                        break;
                    }

                    start++;
                    end--;
                }

                // Output result
                if (isPalindrome) {
                    System.out.println("The given string is a Palindrome.");
                } else {
                    System.out.println("The given string is NOT a Palindrome.");
                }

                scanner.close();
            }
        }