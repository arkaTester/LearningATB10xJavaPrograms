package ex_04_Operators;

public class Lab_038_Operators_Relational {
    // < Less Than
    // < =  -> Less than or equal to
    // > Greater
    // > = Greater or equal
    // == ->  Equal to (but checking)
    // != -> Not equal

    // All of them will result boolean output.

    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        boolean c = a > b; // 10> 30
        System.out.println(c);


        int age_praveen = 34;
        int age_ram = 34;
        boolean result = age_ram >= age_praveen;
        System.out.println(result);

        // age_ram > age_praveen or age_ram = age_praveen


    }
}
