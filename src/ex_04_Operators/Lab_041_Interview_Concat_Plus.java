package ex_04_Operators;

public class Lab_041_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Rohan";
        String last_name = "Singh";
        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // RohanSingh1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // First + math -> 20RohanSingh



        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub



    }
}
