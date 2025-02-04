package Tasks_Practice_Questions;

public class Increment_Example {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); // (11 + 11 + 12)
        System.out.println(a);  // Final value of a after all operations (a = 13)
    }
}
