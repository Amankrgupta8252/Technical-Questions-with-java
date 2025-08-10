public class Factorial {
    public static void main(String [] args) {
        int nums = 5;

        int factInt = factorialOfNum(nums);

        System.out.println("factorialOfNum : "+ factInt);      
    }
    public static int factorialOfNum(int nums){
        if (nums == 0 || nums ==1){
            return 1;
        }

        return nums*factorialOfNum(nums - 1);
    }
}
