/*
 
🔀 8. Remove Duplicates from Sorted List
Input: 1 → 1 → 2 → 3 → 3
Output: 1 → 2 → 3

*/

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the linked list :");
        int n = sc.nextInt();
        System.out.println("Enter the nodes of the linked list :"); 

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        System.out.println("Input Linked List: " + list);
        LinkedList<Integer> result = removeDuplicates(list);
        System.out.println("Linked List after removing duplicates: " + result);
    }
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--; // Adjust index after removal
            }
        }
        return list;
    }
}
