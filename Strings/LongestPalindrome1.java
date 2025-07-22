/*
 
🔠 1. Longest Palindromic Substring Input: "babad" Output: "bab" (or "aba") 
💡 Longest substring dhoondo jo palindromic ho.

 */

import java.util.*;
public class LongestPalindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String LongeStPalindrome = findLongrstPalindromicSubString(s);
        System.out.println("Longest Palindromic Substring: " + LongeStPalindrome);
        sc.close();
    }

    public static String findLongrstPalindromicSubString(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }


        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                String subStr = s.substring(i, j + 1);
                if (isPalindrome(subStr) && subStr.length() > end - start) {
                    start = i;
                    end = j + 1;
                }
            }
        }
        return s.substring(start, end);
    }
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
