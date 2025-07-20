/*
 * TwoSum.java
 * 
 * ✅ 1. Two Sum
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
 Kis do index par value ka sum target ke barabar hota hai?

 */

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        System.out.println("Input array: " + Arrays.toString(nums));

        int[] result = TwoSumTarget(nums, target);
        System.out.println("Target: " + target);

        if (result.length == 0) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

        sc.close();
    }

    // Correct return type: int[]
    public static int[] TwoSumTarget(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // If no pair is found
    }
}
