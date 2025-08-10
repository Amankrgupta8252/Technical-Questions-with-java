/*

💬 6. Count Vowels and Consonants
Input: "Hello World"
Output: Vowels = 3, Consonants = 7
🗣️ Vowels aur consonants ka count nikaalo.

 */


import java.util.*;
public class CountVowelsConsonents {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();

        String result = countVowelsAndConsonants(str);
        System.out.println(result);
    }
    public static String countVowelsAndConsonants(String str) {

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            else {
                consonantsCount++;
            }
        }
         return "Vowels = " + vowelsCount + ", Consonants = " + consonantsCount;




        // HashSet<Character> vowels = new HashSet<>();
        // vowels.add('a');
        // vowels.add('e');
        // vowels.add('i');
        // vowels.add('o');
        // vowels.add('u');
        // vowels.add('A');
        // vowels.add('E');
        // vowels.add('I');
        // vowels.add('O');
        // vowels.add('U');

        // int vowelsCount = 0;
        // int consonantsCount = 0;

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (Character.isLetter(ch)) {
        //         if (vowels.contains(ch)) {
        //             vowelsCount++;
        //         } else {
        //             consonantsCount++;
        //         }
        //     }
        // }
        // return "Vowels = " + vowelsCount + ", Consonants = " + consonantsCount;

    }

}
