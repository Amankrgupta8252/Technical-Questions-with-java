/*
 
🔄 9. Rotate Linked List
Input: 1 → 2 → 3 → 4 → 5, k = 2
Output: 4 → 5 → 1 → 2 → 3
💡 Connect list to itself, break at right point.

 */

import java.util.*;
public class RotateLinkedList {
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
        System.out.println("Enter the number of positions to rotate the linked list:");
        int k = sc.nextInt();
        LinkedList<Integer> result = rotateLinkedList(list, k);
        System.out.println("Linked List after rotation: " + result);
        sc.close();
    }
    public static LinkedList<Integer> rotateLinkedList(LinkedList<Integer> list, int k) {
        if (list.isEmpty() || k <= 0) {
            return list; // No rotation needed
        }

        int size = list.size();
        k = k % size; // Handle cases where k is greater than size

        if (k == 0) {
            return list; // No rotation needed
        }

        // Split the list into two parts
        LinkedList<Integer> firstPart = new LinkedList<>(list.subList(0, size - k));
        LinkedList<Integer> secondPart = new LinkedList<>(list.subList(size - k, size));

        // Concatenate the two parts in rotated order
        secondPart.addAll(firstPart);
        return secondPart;
    }
}
