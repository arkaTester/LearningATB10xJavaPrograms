package Tasks_Practice_Questions;
import java.util.Scanner;

public class Largest_of_three_Ternary {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number (a): ");
            int a = sc.nextInt();
            System.out.print("Enter second number (b): ");
            int b = sc.nextInt();
            System.out.print("Enter third number (c): ");
            int c = sc.nextInt();

            // Using ternary operator
            int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

            System.out.println("The largest number is: " + largest);

            sc.close();
        }


}
