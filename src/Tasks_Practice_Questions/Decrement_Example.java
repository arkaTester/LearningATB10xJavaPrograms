package Tasks_Practice_Questions;

public class Decrement_Example {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);  // (19 + 19 + 20)
        System.out.println(a);  // Final value of a after all operations
    }
}
