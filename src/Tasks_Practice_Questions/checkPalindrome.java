package Tasks_Practice_Questions;
import java.util.Scanner;

public class checkPalindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input from the user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            // Convert to lowercase to ignore case sensitivity
            str = str.toLowerCase();

            // Reverse the string
            String reversedStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr += str.charAt(i);
            }

            // Check if the original and reversed strings are equal
            if (str.equals(reversedStr)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is NOT a palindrome.");
            }

            sc.close();
        }
    }


