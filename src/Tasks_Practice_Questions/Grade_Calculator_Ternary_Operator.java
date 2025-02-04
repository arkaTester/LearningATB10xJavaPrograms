package Tasks_Practice_Questions;

import java.util.Scanner;

public class Grade_Calculator_Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        // result = condition ? exp1 : exp2 ;
        String result =((marks>=90 && marks<=100) ? "A" : (marks>=80 && marks<=89) ? "B" : (marks>=70 && marks<=79)? "C" : (marks>=60 && marks<=69)? "D": (marks>=0 && marks<=59)?"F":"Failed");
        System.out.println(result);
    }
}
