/*
 
🔁 5. Reverse Words in a String
Input: "I love coding"
Output: "coding love I"
🔄 Har word ka order reverse karo, lekin characters nahi.

 */

import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String reversedWords = reverseWords(str);
        System.out.println("Reversed words: " + reversedWords);
    }
    public static String reverseWords(String str) {
        String[] words = str.split(" ");

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();

    }
}
