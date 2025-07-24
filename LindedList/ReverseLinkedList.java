/*

🔁 1. Reverse Linked List
Input: 1 → 2 → 3 → 4 → 5
Output: 5 → 4 → 3 → 2 → 1
💡 Reverse the list in-place.

*/
// package LindedList;

import java.util.*;
public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the linked lins :");
        int n = sc.nextInt();
            
        LinkedList<Integer> InputLinkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            InputLinkedList.add(value);
        }

        Collections.reverse(InputLinkedList);
        System.out.println("Reversed Linked List:");

        for (int value : InputLinkedList) {
            System.out.print(value+ " ");
        }
        
    }
}
