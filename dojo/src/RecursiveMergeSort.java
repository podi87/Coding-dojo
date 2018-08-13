import java.util.Arrays;

public class RecursiveMergeSort {

    public int[] mergeSort(int[] array) {
        int [] result;
        int middle = array.length % 2 == 0 ? array.length / 2 : (array.length / 2) + 1;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);
        if (left.length > 1) {
           left = mergeSort(left);
        }
        if (right.length > 1) {
            right = mergeSort(right);
        }
        result = mergeAndSortTwoArrays(left, right);
        return result;
    }

    private int[] mergeAndSortTwoArrays(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int arrayIndex = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                mergedArray[arrayIndex] = a[i];
                arrayIndex++;
                i++;
            } else {
                mergedArray[arrayIndex] = b[j];
                arrayIndex++;
                j++;
            }
        }

        while (i < a.length) {
            mergedArray[arrayIndex] = a[i];
            arrayIndex++;
            i++;
        }
        while (j < b.length) {
            mergedArray[arrayIndex] = b[j];
            arrayIndex++;
            j++;
        }
        return mergedArray;
    }
}