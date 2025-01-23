package ex_03_Literals;

public class Lab_032_Literals_Char {
    public static void main(String[] args) {


        // Chars - Store
        char c1 = 'A';
        // char c2 = "A"; // String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //System.out.println("ArkaPrava");
//        System.out.println("Arka" + new_line + "Prava");
//        System.out.println("Arka" + tab_line +  "Prava");
//        System.out.println("Arka"+ back_space +  "Prava");
        System.out.println("Arka" + carriage_return + "Prava");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char ruppes = '₹';
        System.out.println("Arka has "+ruppes+10);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        char c11  = '\u1F60';


    }
}
