package Tasks_Practice_Questions;
import java.util.Scanner;

public class CLI_User_Input_Taking {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your Name: ");
            String name = sc.nextLine();

            System.out.print("Enter your Age: ");
            int age = sc.nextInt();

            System.out.print("Enter your Salary: ");
            double salary = sc.nextDouble();

            System.out.println("\n--- User Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);

            sc.close();
        }


}
