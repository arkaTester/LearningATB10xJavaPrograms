package ex_01_Java_Basic;
import java.util.Scanner;

public class Lab_009_Multiplication_Table {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            System.out.println("Multiplication Table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }

