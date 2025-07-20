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
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < n2) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }
}