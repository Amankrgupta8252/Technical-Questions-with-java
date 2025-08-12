/*
 
🔁 7. intersection of two linked list

 */

import java.util.*;
public class IntersectionOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the first linkedList :");

        int n1 = sc.nextInt();
        System.out.println("Enter the nodes of the first linkedList :");
        LinkedList<Integer> List1 = new LinkedList<>();

        for (int i = 0; i < n1; i++) {
            int value1 = sc.nextInt();
            List1.add(value1);
        }
        System.out.println("Input Linked List 1: " + List1);
        System.out.println("Enter the number of nodes in the second linkedList :");
        int n2 = sc.nextInt();
        System.out.println("Enter the nodes of the second linkedList :");
        LinkedList<Integer> List2 = new LinkedList<>();
        for (int i = 0; i < n2; i++) {
            int value2 = sc.nextInt();
            List2.add(value2);
        }
        System.out.println("Input Linked List 2: " + List2);

        int IntersectionPoint = findIntersection(List1, List2);

        System.out.println("Intersection Point: " + IntersectionPoint);
        sc.close();
    }
    public static int findIntersection(LinkedList<Integer> List1, LinkedList<Integer> List2) {

        for (int i = 0; i < List1.size(); i++) {
            for (int j = 0; j < List2.size(); j++) {
                if (List1.get(i).equals(List2.get(j))) {
                    return List1.get(i);
                }
            }
        }
        return -1;
    }
}
