/*
 * IntersectionArray.java
 * 
 
 ✅ 9. Intersection of Two Arrays
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
🔁 Common elements dhoondo dono arrays mein.

 
 */
import java.util.*;

public class IntersectionArray {

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
        System.out.println("Enter the numbers for second array:");
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] IntersectionofTwoArrays = IntersectionofTwoArrays(nums1, nums2);
        System.out.println(Arrays.toString(IntersectionofTwoArrays));
        sc.close();
    }

    public static int[] IntersectionofTwoArrays(int[] nums1, int[] nums2) {

        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersection.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int result[] = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;

    }
}
