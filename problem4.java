import java.util.Arrays;


public class problem4 {

    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZero];
                nums[nonZero] = nums[i];
                nums[i] = temp;
                nonZero++;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of the moveZeroes method
        problem4 solution = new problem4();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original array: " + Arrays.toString(nums));

        solution.moveZeroes(nums);

        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
    }
}
