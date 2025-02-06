package Tasks_Practice_Questions;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter the Number");

        if(num > 0){
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else{
            System.out.println("The number is Zero");
        }

    }
}
