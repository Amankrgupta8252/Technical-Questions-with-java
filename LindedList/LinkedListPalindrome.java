/*
 
🔁 6. Check if Linked List is Palindrome
Input: 1 → 2 → 2 → 1
Output: true
💡 Reverse second half and compare.

 */

import java.util.*;
public class LinkedListPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the linked list :");
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            linkedList.add(value);
        }
        System.out.println("Input Linked List: " + linkedList);
        boolean isPalindrome = checkPalindrome(linkedList);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
    public static boolean checkPalindrome(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reversedList = new LinkedList<>(linkedList);
        Collections.reverse(reversedList);
        System.out.println("Reversed List: " + reversedList);

        return linkedList.equals(reversedList);
    }
}
