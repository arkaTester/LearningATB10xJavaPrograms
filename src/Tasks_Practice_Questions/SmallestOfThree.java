package Tasks_Practice_Questions;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        System.out.println("The smallest number is: " + min);

        sc.close();
    }
}
