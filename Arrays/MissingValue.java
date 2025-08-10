/*
 
✅ 2. Find Missing Number (0 to n)
Input: nums = [0, 1, 3]
Output: 2
🎯 0 se n tak ke number mein kaunsa number missing hai?

 */

import java.util.*;
public class MissingValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements (n): ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the numbers (0 to " + n + "):");
        for (int i = 0; i <n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(nums));
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
        sc.close();
    }
    public static int findMissingNumber(int[] nums) {
        // int expectedSum = n * (n + 1) / 2;
        
        // int actualSum = 0;
        // for (int num : nums) {
            // actualSum += num;
        // }
        
        // return expectedSum - actualSum;

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != i) {
                return i; 
            }
        }
        return ' '; 
    }
    
}
