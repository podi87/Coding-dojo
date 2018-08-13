public class SumAndFactorial {

    static void printSumAndFactorial(final int[] nums) {
        int sum;
        int factorial;
        int[] evenNums = new int[]{};
        int[] oddNums = new int[]{};

        // divide array elements to even and odd arrays
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNums = ArrayFactory.addElement(evenNums, nums[i]);
            } else {
                oddNums = ArrayFactory.addElement(oddNums, nums[i]);
            }
        }
        // calculating sum of the array
        sum = (evenNums.length*(1+evenNums.length))/2;

        // calculating factorial of array length
        factorial = 1;
        for (int i = 1; i <= oddNums.length; i++) {
            factorial = factorial * i;
        }
        System.out.println("Sum of even numbers: " + sum + " Factorial of odd numbers length: " + factorial);
    }
}
