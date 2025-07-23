/*

🪞 4. Check if String is Palindrome
Input: "madam"
Output: true
🔁 Reverse karke check karo string palindromic hai ya nahi.

 */

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Is the string a palindrome? " + isPalindrome);
        sc.close();
    }
    public static boolean checkPalindrome(String str) {
        String reversStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversStr);
    }
}
