/*
 ✅ 8. Move Zeroes to End
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
📦 Saare 0 ko end mein le jao, baaki order same rahe.

 */

// import java.util.*;
// public class MoveZeroes {
//     public static void main(String[] args) {
//         int[] nums = {0, 0, 1, 0, 3, 12};
//         System.out.println("Input array: " + Arrays.toString(nums));
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[j] == 0) {
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
//         System.out.println("Move Zero in last: " + Arrays.toString(nums));
//     }
// }
import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 0, 3, 12};
        System.out.println("Input array: " + Arrays.toString(nums));

        int result[] = moveZeroesToEnd(nums);
        System.out.println("Move Zero in last: " + Arrays.toString(result));
    }

    public static int[] moveZeroesToEnd(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
