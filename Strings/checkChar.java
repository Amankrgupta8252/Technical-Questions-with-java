/*
 
🔤 2. Valid Anagram Input: s = "anagram", t = "nagaram" Output: true 
✏️ Check karo ki dono strings ke characters same hain ya nahi (same count bhi).

 */

import java.util.*;

public class checkChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String: ");
        String s2 = sc.nextLine();
        boolean Chacker = isAnagrmStrings(s1, s2);
        System.out.println("Are both strings anagrams? " + Chacker);
        sc.close();
    }

    public static boolean isAnagrmStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s2 = s2.substring(0, j) + s2.substring(j + 1);
                    break;
                }
            }
        }
        return s2.isEmpty();
    }

}
