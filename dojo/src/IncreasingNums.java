public class IncreasingNums {

     static boolean isIncreased(final int[] nums) {
        boolean result = true;
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i + 1] < nums[i]) {
                result = false;
            }
        }
        return result;
    }

}
