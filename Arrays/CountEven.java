/*

✅ 6. Count Even Numbers
Input: nums = [12, 345, 2, 6, 7896]
Output: 2
📌 Kitne numbers aise hain jisme even number of digits hain (yahan 12 and 7896).

 */

import java.util.*;
public class CountEven {
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
        
        int evenCount = countEvenNumbers(nums);
        System.out.println("Count of even numbers: " + evenCount);
        
        sc.close();
    }

    public static int countEvenNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
}
