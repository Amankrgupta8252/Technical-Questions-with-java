/*
✅ 11. Find Second Largest Element
Input: nums = [12, 35, 1, 10, 34, 1]
Output: 34
🏆 Second highest number kaun sa hai?

 */

import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers for the array: ");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        int secondLargest = SecondLargestElementValue(nums);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
        sc.close();
    }

    public static int SecondLargestElementValue(int[] nums) {
        Arrays.sort(nums); // ascending

        int largest = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < largest) {
                return nums[i];
            }
        }

        return Integer.MIN_VALUE; // sab element same the
    }
}
