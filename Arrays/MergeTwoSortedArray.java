/*
 ✅ 7. Merge Two Sorted Arrays
Input: nums1 = [1,2,3], nums2 = [2,5,6]
Output: [1,2,2,3,5,6]
💡 Dono sorted arrays ko merge karke ek sorted array banao.

 */

import java.util.*;

class MergeTwoSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in first array: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the numbers for first array:");
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in second array: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the numbers for first array");
        int[] nums2 = new int[n2];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        int MergedArray[] = MergeArray(nums1, nums2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(MergedArray));
        sc.close();

    }

    public static int[] MergeArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int numslength = n1 + n2;
        int mergedArray[] = new int[numslength];

        System.arraycopy(nums1, 0, mergedArray, 0, n1);
        System.arraycopy(nums2, 0, mergedArray, n1, n2);

        Arrays.sort(mergedArray);

        return mergedArray;
    }
}
