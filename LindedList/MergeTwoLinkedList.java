/*

➕ 3. Merge Two Sorted Linked Lists
Input:
List1: 1 → 3 → 5
List2: 2 → 4 → 6
Output: 1 → 2 → 3 → 4 → 5 → 6
💡 Merge without using extra space (recursively or iteratively).

 */

import java.util.*;
public class MergeTwoLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the first linked list :");
        int n1 = sc.nextInt();
        LinkedList<Integer> List1 = new LinkedList<>();

        for(int i = 0; i < n1; i++) {
            int value1 = sc.nextInt();
            List1.add(value1);
        }
        System.out.println("Enter the number of nodes in the second linked list :");
        int n2 = sc.nextInt();
        LinkedList<Integer> List2 = new LinkedList<>();
        for(int i = 0; i < n2; i++) {
            int value2 = sc.nextInt();
            List2.add(value2);
        }

        LinkedList<Integer> MergedList = new LinkedList<>();
        
        MergedList.addAll(List1);
        MergedList.addAll(List2);
        Collections.sort(MergedList);
        System.out.println("Merged Sorted Linked List :"+ MergedList);

    }
}
