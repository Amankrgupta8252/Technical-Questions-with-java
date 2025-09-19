/*
 
🤯 8. First Non-Repeating Character
Input: "aabbcddbe"
Output: "c"
🧠 Jo character sirf ek baar aaya ho, sabse pehle.

 */

import java.util.*;

public class NonRepetingChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        char result = firstNonRepeatingCharacter(str);
        System.out.println("First Non-Repeating Character: " + result);
        sc.close();
    }

    public static char firstNonRepeatingCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return str.charAt(i);
            }
        }
        return ' ';

    }
}
