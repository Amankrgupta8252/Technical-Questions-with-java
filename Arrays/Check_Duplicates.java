/*
 
✅ 3. Check for Duplicates
Input: nums = [1, 2, 3, 1]
Output: true
🧠 Array mein koi number do baar repeat to nahi ho raha?


 */

import java.util.*;
public class Check_Duplicates {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("input array: " + Arrays.toString(nums));
        boolean DuplicatesValue = CheckDuplicatesValue(nums);
        System.out.println("Duplicates: " + DuplicatesValue);

    }
    public static boolean  CheckDuplicatesValue(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; 
                }
            }
        }
        return false; 
    }
}


