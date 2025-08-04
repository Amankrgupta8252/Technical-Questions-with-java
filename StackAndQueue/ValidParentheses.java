/*

✅ 1. Valid Parentheses
Input: s = "({[]})"
Output: true
💡 Har open bracket ka correct close bracket aana chahiye — Stack use karke match karo.

 */

import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of parentheses :");
        String s = sc.nextLine();
        boolean result = isValid(s);
        System.out.println("Is the parentheses string valid? " + result);
        sc.close();
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put('(', ')');
        matchingBrackets.put('{', '}'); 
        matchingBrackets.put('[', ']');
        for (char ch : s.toCharArray()) {
            if (matchingBrackets.containsKey(ch)) {
                // If it's an opening bracket, push it onto the stack
                stack.push(ch);
            } else if (matchingBrackets.containsValue(ch)) {
                // If it's a closing bracket, check for matching opening bracket
                if (stack.isEmpty() || ch != matchingBrackets.get(stack.pop())) {
                    return false; // Mismatch found
                }
            }
        }
        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
