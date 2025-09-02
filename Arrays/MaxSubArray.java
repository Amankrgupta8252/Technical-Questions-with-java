/*
 
✅ 4. Maximum Subarray (Kadane’s Algorithm)
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
✍️ Subarray ka maximum sum kya hoga? (Answer: 4 + (-1) + 2 + 1 = 6)

 */

import java.util.*;

public class MaxSubArray {

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
        int maxSumArray = findMaxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + maxSumArray);
        sc.close();
    }

    public static int findMaxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

}
