/*
 
✅ 5. Rotate Array
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
🌀 Array ko right mein 3 step rotate karo.

 */

import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(nums));
        
        System.out.print("Enter the number of rotations (k): ");
        int k = sc.nextInt();
        
        rotateArray(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
        
        sc.close();
    }
    public static void rotateArray(int[] nums, int k) {
        
        for (int i = 0; i < k; i++) {
            int lastElement = nums[nums.length - 1]; // Store the last element
           
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastElement; 
        }

    }

}
