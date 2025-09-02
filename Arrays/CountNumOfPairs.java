/*
 ✅ 12. Count Number of Pairs with Given Sum
Input: nums = [1, 5, 7, -1, 5], sum = 6
Output: 3
📊 Kitne pairs ka sum 6 hai? (1+5, 7+-1, 1+5)

 */

import java.util.*;

public class CountNumOfPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers for the array: ");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int targetSum = sc.nextInt();
        int count = CountPairsWithGivenSum(nums, targetSum);
        System.out.println("Number of pairs with sum " + targetSum + ": " + count);
        sc.close();
    }

    public static int CountPairsWithGivenSum(int[] nums, int targetSum) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    count++;
                }
            }
        }
        return count;
    }
}
