/*
 
✅ 10. Reverse Array
Input: nums = [1,2,3,4,5]
Output: [5,4,3,2,1]
🔄 Array ko ulta karo.

 */

import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers for the array: ");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        // ReverseArrayVlaues(nums);
        int[] reversedArray = ReverseArrayVlaues(nums);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static int[] ReverseArrayVlaues(int[] nums) {

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
        // int Left = 0;
        // int Right = nums.length - 1;
        // while (Left < Right) {
        //     int temp = nums[Left];
        //     nums[Left] = nums[Right];
        //     nums[Right] = temp;
        //     Left++;
        //     Right--;
        // }
        // return nums;
    }
}
