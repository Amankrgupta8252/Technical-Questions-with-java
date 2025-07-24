/*

🎯 5. Find Middle of Linked List
Input: 1 → 2 → 3 → 4 → 5
Output: 3
💡 Use slow and fast pointer.


 */

import java.util.*;
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the list :");
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            linkedList.add(value);
        }
        System.out.println("Input Linked List: " + linkedList);
        
        int Size = linkedList.size();

        if (Size %2 == 0) {
            int mid1 = Size / 2 -1;
            int mid2 = Size / 2;
            System.out.println("Middle elements: " +linkedList.get(mid1)+ " and " + linkedList.get(mid2));
        } 
        else {
            int mid = Size / 2;
            System.out.println("Middle element: " + linkedList.get(mid));
        }
        sc.close();
    }

}
