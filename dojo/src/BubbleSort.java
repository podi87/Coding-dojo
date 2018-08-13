public class BubbleSort {

    static int[] bubbleSort(int[] nums) {
        boolean hasSwap;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            hasSwap = false;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    hasSwap = true;
                }
            }
        }
        return nums;
    }

    static int[] bubbleSort2(int[] nums) {
        boolean hasSwap;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            hasSwap = false;
            for (int j = 0; j+1 < nums.length; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    hasSwap = true;
                }
            }
            if(!hasSwap) {
                break;
            }
        }
        return nums;
    }
}
