package Tasks_Practice_Questions;
import java.util.Scanner;

public class SmallestOfTwo {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int min = (num1 < num2) ? num1 : num2;
            System.out.println("The smallest number is: " + min);

            sc.close();
        }


}
