package Tasks_Practice_Questions;

public class countVowelConsonant {
    public static void main(String[] args) {

        int countVowel = 0, countConsonant= 0;

        String str = "This is a very Simple Sentence";
        str = str.toLowerCase();

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'a' ){
                countVowel++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                countConsonant++;
            }

        }
        System.out.println("Number of Vowel: "+countVowel);
        System.out.println("Number of Consonant: "+countConsonant);

    }

}
