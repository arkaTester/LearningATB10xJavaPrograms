import java.util.Scanner;

public class MaxOFTwoCLI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;

        System.out.println("Max is: " + max);
        sc.close(); // Close scanner to avoid memory leak
    }
}
